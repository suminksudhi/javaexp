package com.example.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {

	public static void main(String[] args) {
		new ExecutorDemo();
	}

	public ExecutorDemo() {
		demoOne();
	}
	
	private void demoOne(){
		
		
		//Executor executor = new ThreadPoolExecutor(20, 20, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
		//Executor executor = Executors.newFixedThreadPool(20);
		//Executor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		//Executor executor = Executors.newCachedThreadPool();
		Executor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
		//Executor executor = Executors.newSingleThreadExecutor();
		
		for(int i=0;i<50;i++){
			executor.execute(new CricketTask());
		}
	
		
	}

}

class CricketTask implements Runnable {

	public void run() {
		System.out.println("Cricket is good for health.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
