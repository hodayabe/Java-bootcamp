package ex5;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	static final int INDEX1 = 20;
	static final int INDEX2 = 480;
	static final int INDEX3 = 700;
	static final int LIST_SIZE = 1000;
	static List<Integer> randomList = new ArrayList<>(LIST_SIZE);
	static List<Integer> doubleList = new ArrayList<>();
	static List<String> stringList = new ArrayList<>();
	static List<Integer> list3 = new ArrayList<>();

	public static void main(String[] args) {
		for (int i = 0; i < LIST_SIZE; i++) {
			randomList.add(i);
		}
		
		randomList.set(INDEX1, null);
		randomList.set(INDEX2, null);
		randomList.set(INDEX3, null);
		
		for (Integer i : randomList) {
			System.out.print(i+",");
		}
		System.out.println();
		
		Thread thread1 = new Thread(new doubleThread(), "Thread 1");
		
		thread1.start();
		

	}

	static class doubleThread implements Runnable {

		@Override
		public void run() {
			try {
				for (Integer i : randomList) {
					doubleList.add(i*2);
				}
			} catch (NullPointerException e) {
				System.out.println("DoubleThread exception...");
				e.printStackTrace();
			}
			System.out.println("size " + doubleList.size());
		}
	}
	
	
	
	static class add1Thread implements Runnable {

		@Override
		public void run() {
			try {
				for (Integer i : randomList) {
					stringList.add(Integer.toString(i));
				}
			} catch (NullPointerException e) {
				System.out.println("DoubleThread exception...");
				e.printStackTrace();
			}
			System.out.println("size " + doubleList.size());
		}
		
	}
	
	

}