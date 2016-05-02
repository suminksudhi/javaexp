package com.example.barrier;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.LongStream;

public class BarrierDemo {

	static BlockingQueue<Long> longs = new ArrayBlockingQueue<>(5);

	public static void main(String[] args) {
		new BarrierDemo();
	}

	public BarrierDemo() {

		// CyclicBarrier barrier = new CyclicBarrier(5);
		CyclicBarrier barrier = new CyclicBarrier(5, new BarrierAction());

		new Thread(new CalTask(barrier, 1, 500000)).start();
		new Thread(new CalTask(barrier, 500001, 1000000)).start();
		new Thread(new CalTask(barrier, 1000001, 1500000)).start();
		new Thread(new CalTask(barrier, 1500001, 2000000)).start();
		new Thread(new CalTask(barrier, 2000001, 2500000)).start();

		/*
		 * new Thread(new CalTask(barrier, 1, 500000)).start(); new Thread(new
		 * CalTask(barrier, 500001, 1000000)).start(); new Thread(new
		 * CalTask(barrier, 1000001, 1500000)).start(); new Thread(new
		 * CalTask(barrier, 1500001, 2000000)).start(); new Thread(new
		 * CalTask(barrier, 2000001, 2500000)).start();
		 * 
		 * new Thread(new CalTask(barrier, 1, 500000)).start(); new Thread(new
		 * CalTask(barrier, 500001, 1000000)).start(); new Thread(new
		 * CalTask(barrier, 1000001, 1500000)).start(); new Thread(new
		 * CalTask(barrier, 1500001, 2000000)).start(); new Thread(new
		 * CalTask(barrier, 2000001, 2500000)).start();
		 */
	}

}

class CalTask implements Runnable {

	CyclicBarrier barrier = null;
	int startValue;
	int endValue;

	public CalTask(CyclicBarrier barrier, int startValue, int endValue) {
		this.barrier = barrier;
		this.startValue = startValue;
		this.endValue = endValue;
	}

	public void run() {

		long sum = 0L;
		for (; startValue <= endValue; startValue++) {
			sum = sum + startValue;
		}
		try {
			BarrierDemo.longs.put(sum);
			TimeUnit.SECONDS.sleep((int) (Math.random() * 5));
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		System.out.printf("Worker : %s finished its part of task and waiting at barrier!%n",
				Thread.currentThread().getName());
		try {
			barrier.await(4, TimeUnit.SECONDS);
			// System.out.printf("All parties reached the barrier!%n");

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
}

class BarrierAction implements Runnable {

	public void run() {
		System.out.printf("All parties reached the barrier!%n");
		long result = BarrierDemo.longs.stream().reduce((x, y) -> x + y).get();
		System.out.printf("Result : %d%n", result);
		assert result == LongStream.rangeClosed(1, 2500000).sum();
		System.out.println("Passed!");
	}
}
