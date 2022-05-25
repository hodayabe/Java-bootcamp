package ex6;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	static final int LIST_SIZE = 50;
	static List<Integer> list = new ArrayList<>(LIST_SIZE);
	static  int sum = 0;

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= LIST_SIZE; i++) {
			list.add(i);
		}

		Thread thread1 = new Thread(new SumThread(0,LIST_SIZE/2), "Thread 1");
		Thread thread2 = new Thread(new SumThread(LIST_SIZE/2,LIST_SIZE), "Thread 2");
		

		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println("global sum: "+sum);
		
		sumOfList();

	}
	
	public static void sumOfList() {
		int sum=0;
		for (Integer i : list) {
			sum+=i;
		}
		System.out.println("function sum: "+ sum);
	}
	

	static class SumThread implements Runnable {
		int startIndex;
		int endIndex;
		
		public SumThread(int startIndex, int endIndex) {
			this.startIndex = startIndex;
			this.endIndex = endIndex;
		}


		@Override
		public void run() {
			for (Integer i : list) {
				sum+=i;
			}
			System.out.println(Thread.currentThread().getName() +"fonish");

		}

	}
}