package ex3;

public class runner {

	public static int num = 1;
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup group = new ThreadGroup("Group");

		Thread thread1 = new Thread(group, new MyThread(), "Thread1");
		Thread thread2 = new Thread(group, new MyThread(), "Thread2");
		Thread thread3 = new Thread(group, new MyThread(), "Thread3");

		thread1.start();
		thread2.start();
		thread3.start();

		Thread.sleep(2000);
		group.interrupt();
		
	}

	static class MyThread implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(100);
					num*=2;
					System.out.println(Thread.currentThread().getName()+" num: "+num);
				} catch (InterruptedException e) {
					return;
				}
			}
		}
	}


}
