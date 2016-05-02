package com.example.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.stream.IntStream;

public class ThreadFactoryDemo {

	public static void main(String[] args) {
		new ThreadFactoryDemo();
	}

	public ThreadFactoryDemo() {

		//ExecutorService executor = new ThreadPoolExecutor(20, 20, 0L, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>(), new WorkerThreadFactory());
		ExecutorService executor = Executors.newFixedThreadPool(20,new WorkerThreadFactory());

		IntStream.rangeClosed(1, 50).forEach((value) -> {
			executor.submit(() -> {
				System.out.println("Database task "+ value+" is running... by : " + Thread.currentThread().getName());
			});
		});
	}

}

class WorkerThreadFactory implements ThreadFactory {

	static int counter = 1;

	public Thread newThread(Runnable runnable) {
		Thread thread = new Thread(runnable);
		thread.setName("User Worker " + counter++);
		thread.setPriority(8);
		return thread;
	}

}
