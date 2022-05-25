package ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.stream.util.EventReaderDelegate;

public class Runner {
	static final int LIST_SIZE = 100000;
	static final int NEGATIVE = 3;
	static List<Integer> list1 = new ArrayList<>(LIST_SIZE);
	static List<Integer> list2 = new ArrayList<>(LIST_SIZE);

	public static void main(String[] args) {

		for (int i = 0; i < LIST_SIZE; i++) {
			list1.add(i);
			list1.add(i + 1000);
		}

		list1.set(NEGATIVE, -10);

		Thread thread1 = new Thread(new MyThread1(), "Thread 1");
		Thread thread2 = new Thread(new MyThread2(), "Thread 2");

		thread2.setDaemon(true);

		thread1.start();
		thread2.start();

	}

	static class MyThread1 implements Runnable {

		@Override
		public void run() {
			try {
				for (Integer i : list1) {
					Thread.sleep(1);
					if (i < 0) {
						System.out.println(Thread.currentThread().getName() + " negative value is found");
						return;
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + "  not found");
		}
	}
	
	

	static class MyThread2 implements Runnable {
		@Override
		public void run() {
			for (Integer i : list1) {
				int result=Collections.binarySearch(list2,i);
				if(result>=0) {
					System.out.println(" the arrays have avalue in common");
					return;
					
				}
			}
			System.out.println(Thread.currentThread().getName() + "  not found");
		}
	}

}
