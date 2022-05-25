package threadpool.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.*;

public class Runner {
	private static final int CORE_THREADS = 2;
	private static final int MAX_POOL_SIZE = 4;
	private static final int CAPACITY = 2;
	private static final long KEEP_ALIVE_TIME = 3;

	private static final BlockingQueue<Runnable> tasks = new ArrayBlockingQueue<>(CAPACITY);

	private static Map<String, Integer> words = new HashMap<>();
	// private static List< String> tempLine;

	public static void main(String[] args) throws InterruptedException {

		ThreadPoolExecutor pool = new ThreadPoolExecutor(CORE_THREADS, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS,
				tasks, new ThreadPoolExecutor.CallerRunsPolicy());

		try {
			Scanner scanner = new Scanner(new File("myFiles/alice.txt"));

			while (scanner.hasNextLine()) {
				String[] tempLine = scanner.nextLine().toLowerCase().split("[^a-z]");
				
				pool.execute(() -> {
					for (String word : tempLine) {
						if (word.length() <= 1)
							continue;
						if (words.containsKey(word))
							words.put(word, words.get(word) + 1);
						else 
							words.put(word, 1);
					}
				});
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		pool.shutdown();
		pool.awaitTermination(30, TimeUnit.SECONDS);

		words.entrySet().stream().forEach((s) -> System.out.println(s.getKey() + "   : " + s.getValue()));

	}

	private static String cleanString(String word) {

		int i = 0;
		String res = "";
		for (; i < word.length(); i++) {
			if (Character.isLetter(word.charAt(i)))
				break;
		}

		return res;

	}

}