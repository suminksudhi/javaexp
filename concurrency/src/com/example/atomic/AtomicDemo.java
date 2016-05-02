package com.example.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

	public static void main(String[] args) {
		new AtomicDemo();
	}

	public AtomicDemo() {
		
		TaskA taskA = new TaskA();
		
		new Thread(taskA).start();
		new Thread(taskA).start();
	}
}

class TaskA implements Runnable {

	//int i = 10;
	AtomicInteger atomicInteger = new AtomicInteger(10);
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"   "+atomicInteger.getAndIncrement());
	}

}
