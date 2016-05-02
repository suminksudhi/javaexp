package com.example.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class CallableDemo {

	public static void main(String[] args) {
		new CallableDemo();
	}

	public CallableDemo() {
		demoTwo();
		// demoOne();
	}

	private void demoTwo() {

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Future<Integer> future = executorService.submit(new CalTask());

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		future.cancel(true);
		System.out.println(future.isCancelled());
		try {
			int result = future.get();
			System.out.printf("Result : %d%n", result);
		} catch (InterruptedException | ExecutionException | CancellationException e) {
			e.printStackTrace();
		}
	}

	private void demoOne() {

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Future<Integer> future = executorService.submit(new CalTask());

		try {
			System.out.println("Waiting for result to compute......");
			int result = future.get();
			System.out.printf("Result : %d%n", result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}
}

class CalTask implements Callable<Integer> {

	public Integer call() throws Exception {
		// TimeUnit.SECONDS.sleep(5);
		return IntStream.rangeClosed(1, 100).sum();
	}

}
