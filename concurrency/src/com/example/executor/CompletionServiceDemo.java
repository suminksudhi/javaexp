package com.example.executor;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class CompletionServiceDemo {

	public static void main(String[] args) {
		new CompletionServiceDemo();
	}

	public CompletionServiceDemo() {
		demoOne();
	}

	private void demoOne() {

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		CompletionService<Double> completionService = new ExecutorCompletionService<>(executorService);
		
		try {
			double result = completionService.submit(()->{ return IntStream.rangeClosed(1, 50).average().getAsDouble(); }).get();
			System.out.println("Result :  "+result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
	}
}
