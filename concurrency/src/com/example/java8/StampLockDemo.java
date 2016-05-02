package com.example.java8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.StampedLock;

public class StampLockDemo {

	public static void main(String[] args) {
		new StampLockDemo();
	}

	public StampLockDemo() {
		DatabaseTask task = new DatabaseTask();

		new Thread(task, "Writer").start();
		new Thread(task, "Reader").start();
	}
}

class DatabaseTask implements Runnable {

	int data = 1000;
	StampedLock lock = new StampedLock();

	public void run() {
		if (Thread.currentThread().getName().startsWith("Reader")) {
			display();
		}
		if (Thread.currentThread().getName().startsWith("Writer")) {
			change();
		}
	}

	private void display() {
		//long stamp = lock.readLock();
		long stamp = lock.tryOptimisticRead();
		System.out.println("Inside read lock!!!!");
		System.out.println("Valid : "+lock.validate(stamp));
			
		/*try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		System.out.println("Valid : "+lock.validate(stamp));
			
		System.out.println(data);
		
		System.out.println("Valid : "+lock.validate(stamp));
		if(lock.validate(stamp))
			lock.tryUnlockRead();
	}

	private void change() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long stamp = lock.writeLock();
		data++;
		lock.unlockWrite(stamp);
	}

}
