package com.example.executor;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorLifeCycleDemo {

	public static void main(String[] args) {
		new ExecutorLifeCycleDemo();
	}

	public ExecutorLifeCycleDemo() {
		//demoOne();
		demoTwo();
	}

	private void demoTwo() {

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(new PrintTask());
		executor.submit(()-> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Saving task is going on.....");
		});

		executor.submit(()-> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Spell Check task is going on.....");
		});
			
	}
	
	private void demoOne() {

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new PrintTask());
		executor.execute(new PrintTask());
		executor.execute(new PrintTask());
		executor.execute(new PrintTask());
		executor.execute(new PrintTask());
		executor.execute(new PrintTask());
		executor.execute(new PrintTask());
		executor.execute(new PrintTask());
		executor.execute(new PrintTask());
		executor.execute(new PrintTask());

		executor.shutdown();
		try {
			System.out.println("Pool still running......");
			executor.awaitTermination(2, TimeUnit.SECONDS);
			System.out.println(executor.isTerminated());
			List<Runnable> remainingTasks = executor.shutdownNow();
			System.out.printf("Remaining task count : %d%n",remainingTasks.size());
			System.out.println("Pool has been shutdown......");
			System.out.println(executor.isTerminated());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}

}

class PrintTask implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Document is printing.......");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
