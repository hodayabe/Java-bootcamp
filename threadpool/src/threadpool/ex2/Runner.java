package threadpool.ex2;


import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveAction;

public class Runner {
	private static final int SIZE = 1000;
	private static double[] array = new double[SIZE];
	private static double sum = 0;

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextDouble(10) + 1;
		}

		ForkJoinPool pool = new ForkJoinPool(2);

		Future<?> future = pool.submit(new IncrementTask(0, SIZE));

		future.get();

		System.out.println("The array is: " + Arrays.toString(array));
		System.out.println("The sum of array is: " + sum);
	}

	static class IncrementTask extends RecursiveAction {
		private final int left;
		private final int right;

		public IncrementTask(int left, int right) {
			this.left = left;
			this.right = right;
		}

		@Override
		protected void compute() {
			if (right - left < 3) {
				for (int i = left; i < right; i++) {
					sum += array[i];
				}
			} else {
				int mid = (left + right) / 2;
				invokeAll(new IncrementTask(left, mid), new IncrementTask(mid, right));
			}
		}
	}
}