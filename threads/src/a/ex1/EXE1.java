package a.ex1;

import java.util.ArrayList;
import java.util.List;

public class EXE1 {
	private static final int SIZE = 50, NUM_THREADS = 2;

	private List<Integer> list;
	private int sum;

	public EXE1() {
		this.list = new ArrayList<>();
	}

	public void initList() {
		for (int i = 0; i < SIZE; i++) {
			list.add(i);
		}
	}

	public void sumList() {
		list.forEach(x -> sum += x);
	}

	public void printSum() {
		System.out.println("This is the serial sum result : " + sum);
	}

	public synchronized void addToSum(int addition) {
		sum += addition;
	}

	public static void main(String[] args) {
		EXE1 runner = new EXE1();
		runner.initList();
		runner.sumList();
		runner.printSum();
		runner.sum = 0;

		int listSlice = SIZE / NUM_THREADS;
		List<Thread> threads = new ArrayList<>(NUM_THREADS);

		for (int i = 0; i < NUM_THREADS; i++) {
			Thread thread = new Thread(new SumListSection(i * listSlice, (i + 1) * listSlice, runner));
			thread.start();
			threads.add(thread);
		}

		threads.forEach(x -> {
			try {
				x.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		System.out.println("This is the parallel sum result : " + runner.sum);

	}
}
