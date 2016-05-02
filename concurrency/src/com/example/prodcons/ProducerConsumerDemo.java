package com.example.prodcons;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		new ProducerConsumerDemo();
	}
	
	public ProducerConsumerDemo() {
	
		LinkedList<Integer> integers = new LinkedList<>();
		
		new Thread(new Producer(integers)).start();
		new Thread(new Consumer(integers)).start();
					
	}
	
}

class Producer implements Runnable{
	
	LinkedList<Integer> integers = null;
	
	public Producer(LinkedList<Integer> integers) {
		this.integers = integers;
	}
	
	public void run() {
		while(true){
			synchronized (integers) {
				if(!integers.isEmpty()){
					try {
						integers.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				integers.addLast((int)(Math.random()*5000));	
				System.out.println("Producer Done!");
				integers.notify();
			}
		}
	}
	
}


class Consumer implements Runnable{

	LinkedList<Integer> integers = null;
	
	public Consumer(LinkedList<Integer> integers) {
		this.integers = integers;
	}
	
	public void run() {
		while(true){
			synchronized (integers) {
				if(integers.isEmpty()){
					try {
						integers.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
				}

				int result = integers.removeFirst();	
				System.out.printf("Consumed %d%n",result);
				try{
					TimeUnit.SECONDS.sleep(2);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				integers.notify();
			}
		}
	}
	
}
