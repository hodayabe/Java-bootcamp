package threadpool.ex4;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Runner {

	private static final int NUM_THREADS = 3;
	private static int num = 0;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
		List<Callable<Integer>> callables = new ArrayList<>();

		try {
			
			URL oracle = new URL("https://en.wikipedia.org/wiki/Java_(programming_language)");
			URLConnection yc = oracle.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			
			
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				String[] tempLine = inputLine.toLowerCase().split(" ");

				callables.add(() -> {
					int sum1 = 0;
					for (String word : tempLine) {
						if (word.equals("java"))
							sum1++;
					}
					return sum1;
				});
			}

			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("----------------");
			 e.printStackTrace();
		}

		List<Future<Integer>> futures = executorService.invokeAll(callables);
		int sum = 0;
		for (Future<Integer> future : futures) {
			sum += future.get();
		}

		System.out.println("The word java appears "+sum+" times");

		executorService.shutdown();
		executorService.awaitTermination(2, TimeUnit.SECONDS);

	}

}