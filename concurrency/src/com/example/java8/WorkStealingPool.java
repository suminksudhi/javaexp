package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkStealingPool {

	public static void main(String[] args) {
		new WorkStealingPool();
	}

	public WorkStealingPool() {
		demoTwo();
		// demoOne();
	}

	private void demoTwo() {

		ExecutorService executorService = Executors.newWorkStealingPool();
		List<Callable<Double>> list = Arrays.asList(
				() ->{ 
					System.out.printf("Thread : %s%n",Thread.currentThread().getName());
					return (Math.random() * 100); 
				}, 
				() ->{ 
					System.out.printf("Thread : %s%n",Thread.currentThread().getName());
					return (Math.random() * 100); 
				}, 
				() ->{ 
					System.out.printf("Thread : %s%n",Thread.currentThread().getName());
					return (Math.random() * 100); 
				}, 
				() ->{ 
					System.out.printf("Thread : %s%n",Thread.currentThread().getName());
					return (Math.random() * 100); 
				}, 
				() ->{ 
					System.out.printf("Thread : %s%n",Thread.currentThread().getName());
					return (Math.random() * 100); 
				}, 
				() ->{ 
					System.out.printf("Thread : %s%n",Thread.currentThread().getName());
					return (Math.random() * 100); 
				}, 
				() ->{ 
					System.out.printf("Thread : %s%n",Thread.currentThread().getName());
					return (Math.random() * 100); 
				}, 
				() ->{ 
					System.out.printf("Thread : %s%n",Thread.currentThread().getName());
					return (Math.random() * 100); 
				}
			);

		try {
			String result = executorService.invokeAll(list).stream().map((future) -> {
				try {
					return "" + future.get();
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
				return "";
			}).reduce((x, y) -> {
				return x + " | " + y;
			}).get();
			System.out.println(result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	private void demoOne() {

		ExecutorService executorService = Executors.newWorkStealingPool();
		try {
			double result = executorService.submit(() -> {
				return (Math.random() * 100);
			}).get();
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}
}
