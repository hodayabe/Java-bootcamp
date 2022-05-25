package a.ex2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

	
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();

		Queue<String> queue = new LinkedList<>();

		Thread server = new Thread(new Service(queue,lock,condition), "server");
		Thread marketing = new Thread(new Marketing(queue,lock,condition), "marketing ");

		server.start();
		marketing.start();
	}

}
