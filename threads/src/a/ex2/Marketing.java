package a.ex2;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Marketing implements Runnable {

	private final Queue<String> queue;
	private Lock lock;
	private Condition condition;

	public Marketing(Queue<String> queue, Lock lock, Condition condition) {
		this.queue = queue;
		this.lock = lock;
		this.condition = condition;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consumeData();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void consumeData() throws InterruptedException {
		lock.lock();
		while (queue.isEmpty()) {
			System.out.println("Consumer is waiting...");
			condition.await();
		}

		Thread.sleep(10000);

		queue.remove();
		System.out.println(Thread.currentThread().getName() + " is consumed data with id " + queue.size());

		if (queue.size() == 1) {
			condition.signal();
		}

		lock.unlock();
	}
}
