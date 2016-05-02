package com.example.latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class WorkerToCoordinatorLatchDemo {

	public static void main(String[] args) {
		new WorkerToCoordinatorLatchDemo();
	}

	public WorkerToCoordinatorLatchDemo() {

		CountDownLatch startSignal = new CountDownLatch(1);
		CountDownLatch finishSignal = new CountDownLatch(5);

		HeavyWeightTask task = new HeavyWeightTask(startSignal, finishSignal);

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

		try {
			System.out.println("Coordinator is waiting for workers to finish the work...");
			finishSignal.await();
			System.out.println("Coordinator received the result and will go home...");
			// 10 loc
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class HeavyWeightTask implements Runnable {

	CountDownLatch startSignal = null;
	CountDownLatch finishSignal = null;

		
	public HeavyWeightTask(CountDownLatch startSignal, CountDownLatch finishSignal) {
		this.startSignal = startSignal;
		this.finishSignal = finishSignal;
	}

	public void run() {

		try {
			System.out.println("Worker is waiting for signal from Coordinator to start the work!");
			startSignal.await();
			System.out.println("Very Heavy waight taks is done!");
			finishSignal.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
