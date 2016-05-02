package com.example.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {

	public static void main(String[] args) {
		new SemaphoreDemo();
	}

	public SemaphoreDemo() {
		
		Semaphore semaphore = new Semaphore(1);
		System.out.printf("Total Permits : %d%n",semaphore.availablePermits());

		
		SomeTask task = new SomeTask(semaphore);
		
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		
	}
}

class SomeTask implements Runnable {
	Semaphore semaphore = null;
	
	public SomeTask(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	public void run() {
		try {
			semaphore.acquire();
				System.out.printf("Available Permits : %d%n",semaphore.availablePermits());
				System.out.println("I am doing my work....Step 1");
				System.out.println("I am doing my work....Step 2");
				System.out.println("I am doing my work....Step 3");
				TimeUnit.SECONDS.sleep(2);
			semaphore.release();
			System.out.printf("Available Permits : %d%n",semaphore.availablePermits());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}