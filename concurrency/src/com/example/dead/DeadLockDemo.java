package com.example.dead;

import java.util.concurrent.TimeUnit;

public class DeadLockDemo implements Runnable {

	String pen = "Pen";
	String notepad = "Notepad";

	public static void main(String[] args) {
		new DeadLockDemo();
	}

	public DeadLockDemo() {
		new Thread(this, "A").start();
		new Thread(this, "B").start();
	}

	public void run() {

		if (Thread.currentThread().getName().equals("A")) {
			synchronized (notepad) {
				System.out.println("Thread A obtained lock on Notepad!!");
				synchronized (pen) {
					System.out.println("Thread A is using Notepad and Pen right now!!");
				}

			}
		}

		if (Thread.currentThread().getName().equals("B")) {

			synchronized (pen) {
				System.out.println("Thread B obtained lock on Pen!!");

				synchronized (notepad) {
					System.out.println("Thread B is using Notepad and Pen right now!!");
				}

			}

		}

	}

}
