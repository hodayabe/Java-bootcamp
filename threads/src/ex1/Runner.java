package ex1;

public class Runner {
	private static final int NUM_LOOP = 3;
	static int num = 10;

	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < NUM_LOOP; i++) {
					System.out.println(Thread.currentThread().getName());
					num *= 2;
				}
			}
		};
		

		Thread thread1 = new Thread(runnable1, "thread 1");

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < NUM_LOOP; i++) {
				System.out.println(Thread.currentThread().getName());
				num+=2;
			}
		}, "thread 2");
		
		
		
		Thread thread3 = new Thread(new MyThread(), "Thread 3");
		
		
		thread3.setPriority(10);
		thread2.setPriority(8);
		thread1.setPriority(2);
		
		thread3.start();
		thread2.start();
		thread1.start();
		
		
		
		thread3.join();
		thread2.join();
		thread1.join();
		System.out.println("num is: "+ num);
		

	}

	static class MyThread implements Runnable {
		
		@Override
		public void run() {
			for (int i = 0; i < NUM_LOOP; i++) {
				System.out.println(Thread.currentThread().getName());
				num/=2;
			}
		}
	}
	
	

}
