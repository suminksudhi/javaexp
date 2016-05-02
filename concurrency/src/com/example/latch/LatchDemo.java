package com.example.latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class LatchDemo {
	
	public static void main(String[] args) {
		new LatchDemo();
	}
	
	public LatchDemo() {
		CountDownLatch startSignal = new CountDownLatch(1);
		HeavyTask task = new HeavyTask(startSignal);
	
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		System.out.println("Coordinator just sent signal for workers to start the work...");
		startSignal.countDown();
				
	}

}

class HeavyTask implements Runnable{

	CountDownLatch startSignal = null;
	
	public HeavyTask(CountDownLatch startSignal) {
		this.startSignal = startSignal;
	}
	
	public void run() {
		
		try {
			System.out.println("Worker is waiting for signal from Coordinator to start the work!");
			startSignal.await();
			System.out.println("Very Heavy waight taks is done!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
