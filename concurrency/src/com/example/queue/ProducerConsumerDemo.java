package com.example.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		new ProducerConsumerDemo();
	}

	public ProducerConsumerDemo() {

		//BlockingQueue<Integer> integers = new ArrayBlockingQueue<>(1);
		BlockingQueue<Integer> integers = new LinkedBlockingQueue<>(50);
		//BlockingQueue<Integer> integers = new SynchronousQueue<>();
		
		new Thread(new Producer(integers)).start();
		new Thread(new Consumer(integers)).start();

	}

}

class Producer implements Runnable {

	BlockingQueue<Integer> integers = null;

	public Producer(BlockingQueue<Integer> integers) {
		this.integers = integers;
	}

	public void run() {
		while (true) {
			try {
				integers.put((int) (Math.random() * 5000));
				System.out.println("Producer Done!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {

	BlockingQueue<Integer> integers = null;

	public Consumer(BlockingQueue<Integer> integers) {
		this.integers = integers;
	}

	public void run() {
		while (true) {
			
			try {
				int result = integers.take();
				System.out.printf("Consumed %d%n", result);
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
