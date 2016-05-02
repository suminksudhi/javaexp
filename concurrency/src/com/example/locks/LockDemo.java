package com.example.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {
		new LockDemo();
	}

	public LockDemo() {

		TaskA taskA = new TaskA();

		new Thread(taskA).start();
		new Thread(taskA).start();
	}
}

class TaskA implements Runnable {

	int i = 10;
	Lock lock = new ReentrantLock(true);

	public void run() {
		//demoThree();
		demoTwo();
		//demoOne();

	}

	private void demoThree() {
		try {
			lock.lockInterruptibly();
				System.out.println(Thread.currentThread().getName() + "   " + i);
				i++;
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void demoTwo() {

		//if (lock.tryLock()) {
		try {
			if (lock.tryLock(10,TimeUnit.MILLISECONDS)) {
				try{
					System.out.println(Thread.currentThread().getName() + "   " + i);
					i++;
				}finally{
					lock.unlock();
				}
			}else{
				System.out.println(Thread.currentThread().getName()+" Could  not acquire the lock!");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void demoOne() {
		lock.lock();
			System.out.println(Thread.currentThread().getName() + "   " + i);
			i++;
		lock.unlock();
	}

}
