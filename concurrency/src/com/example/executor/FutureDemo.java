package com.example.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class FutureDemo {

	public static void main(String[] args) {
		new FutureDemo();
	}

	public FutureDemo() {
		demoThree();
		//demoTwo();
		//demoOne();
	}

	private void demoThree() {
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		List<Future<Integer>> futures = new ArrayList<>();
		for (int i = 1; i < 20; i++) {
			Future<Integer> future = executorService.submit(()-> IntStream.rangeClosed(1, 1000).sum());
			futures.add(future);
		}

		
		try {
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for (Future<Integer> future : futures) {
			try {
				future.cancel(true);
				if(future.isCancelled()){
					System.out.println("Task Cancelled!");
				}else{
					System.out.printf("Result : %d%n", future.get());
				}
			} catch (InterruptedException | ExecutionException | CancellationException e) {
				e.printStackTrace();
			}
		}

	}

	
	private void demoTwo() {
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		List<Future<Integer>> futures = new ArrayList<>();
		for (int i = 1; i < 20; i++) {
			Future<Integer> future = executorService.submit(new SumTask());
			futures.add(future);
		}

		
		try {
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for (Future<Integer> future : futures) {
			try {
				future.cancel(true);
				if(future.isCancelled()){
					System.out.println("Task Cancelled!");
				}else{
					System.out.printf("Result : %d%n", future.get());
				}
			} catch (InterruptedException | ExecutionException | CancellationException e) {
				e.printStackTrace();
			}
		}

	}
	

	private void demoOne() {
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		List<Future<Integer>> futures = new ArrayList<>();
		for (int i = 1; i < 20; i++) {
			Future<Integer> future = executorService.submit(new SumTask());
			futures.add(future);
		}

		for (Future<Integer> future : futures) {
			try {
				System.out.printf("Result : %d%n", future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}

	}
}

class SumTask implements Callable<Integer> {

	public Integer call() throws Exception {
		//TimeUnit.SECONDS.sleep(2);
		return IntStream.rangeClosed(1, 100).sum();
	}

}
