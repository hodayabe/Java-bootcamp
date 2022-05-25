package a.ex2;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service  implements Runnable {
	
		private final Queue<String> queue;
		private Lock lock;
		private Condition condition;

		

		public Service(Queue<String> queue, Lock lock, Condition condition) {
			this.queue = queue;
			this.lock = lock;
			this.condition = condition;
		}

		@Override
		public void run() {
			while (true) {
				try {
					produceData();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		private void produceData() throws InterruptedException {
			lock.lock();
				while (queue.size() == 5) {
					condition.await();
				}

				Thread.sleep(20000);

				System.out.println(Thread.currentThread().getName()+" is producing data with id " + queue.size());
				queue.add("element_" + queue.size());

				if (queue.size() == 1) {
					condition.signal();
				}

				lock.unlock();
		}
	}

	
	
