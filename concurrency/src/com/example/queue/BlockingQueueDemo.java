package com.example.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
	
	public static void main(String[] args) {
		new BlockingQueueDemo();
	}
	
	public BlockingQueueDemo() {
		demoOne();
	}

	private void demoOne(){
		
		BlockingQueue<Integer> integers = new ArrayBlockingQueue<>(5);
		try {
			integers.put(100);
			integers.put(200);
			integers.put(300);
			integers.put(400);
			integers.put(500);
			//integers.put(200);
			
			System.out.println(integers.take());
			System.out.println(integers.take());
			System.out.println(integers.take());
			System.out.println(integers.take());
			System.out.println(integers.take());
			System.out.println(integers.take());
						
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
