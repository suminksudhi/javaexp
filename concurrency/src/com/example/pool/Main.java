package com.example.pool;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		ThreadPool threadPool = new ThreadPool(10);
		for (int i = 1; i <= 100; i++) {
			threadPool.submitTask(new PrintTask());
		}
	}
}

class ThreadPool {

	LinkedList<Runnable> taskQueue = new LinkedList<>();

	public ThreadPool(int size) {
		for (int i = 0; i < size; i++) {
			new WorkerThread(this).start();
		}
	}

	public void submitTask(Runnable task) {
		synchronized (taskQueue) {
			taskQueue.addLast(task);
			taskQueue.notifyAll();
		}
	}

	public Runnable getTask() {
		Runnable result = null;
		synchronized (taskQueue) {
			if (!taskQueue.isEmpty()) {
				result = taskQueue.removeFirst();
			} else {
				try {
					taskQueue.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}

class WorkerThread extends Thread {

	ThreadPool pool = null;

	public WorkerThread(ThreadPool pool) {
		this.pool = pool;
	}

	public void run() {
		while (true) {
			Runnable task = pool.getTask();
			if (task != null) {
				task.run();
			}
		}
	}

}

class PrintTask implements Runnable {

	public void run() {
		System.out.println("Helolooooooo......");
	}
}
