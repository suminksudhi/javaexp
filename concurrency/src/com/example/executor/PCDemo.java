package com.example.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.LongStream;

public class PCDemo {
	public static void main(String[] args) {
		new PCDemo();
	}
	
	public PCDemo() {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		CompletionService<Double> completionService = new ExecutorCompletionService<>(pool);

		producer(completionService);
		consumer(completionService);
	}
	
	private void producer(CompletionService<Double> completionService){
		completionService.submit(new DataIntensiveTask());
	}

	private void consumer(CompletionService<Double> completionService){
		try {
			System.out.println("Result : "+completionService.take().get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}

class DataIntensiveTask implements Callable<Double>{

	public Double call() throws Exception {
		return LongStream.rangeClosed(1, 350000).average().getAsDouble();
	}
	
}
