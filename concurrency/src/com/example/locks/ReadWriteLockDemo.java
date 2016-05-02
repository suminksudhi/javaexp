package com.example.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {

	public static void main(String[] args) {
		new ReadWriteLockDemo();
	}

	public ReadWriteLockDemo() {

		Task task = new Task();

		new Thread(task,"Writer-0").start();
		new Thread(task,"Writer-1").start();
		new Thread(task,"Reader-0").start();
		new Thread(task,"Reader-1").start();
	}
}

class Task implements Runnable {

	int i = 10;
	ReadWriteLock lock = new ReentrantReadWriteLock(true);
	Lock writeLock = lock.writeLock();
	Lock readLock = lock.readLock();
	
	

	public void run() {
		if(Thread.currentThread().getName().startsWith("Writer")){
			change();
		}
		if(Thread.currentThread().getName().startsWith("Reader")){
			display();
		}
	}

	private void display() {
		readLock.lock();
			System.out.println(Thread.currentThread().getName() + "   " +i);
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " completed reading!!");
		readLock.unlock();
	}

	private void change() {
		writeLock.lock();
			System.out.println(Thread.currentThread().getName()+"  is changing data!!");
			i++;
			try {
				TimeUnit.SECONDS.sleep(8);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		writeLock.unlock();
	}

}
