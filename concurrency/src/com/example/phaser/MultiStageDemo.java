package com.example.phaser;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MultiStageDemo {

	public static void main(String[] args) {
		new MultiStageDemo();
	}

	public MultiStageDemo() {

		// Phaser phaser = new Phaser(4);
		Phaser phaser = new Phaser() {
			protected boolean onAdvance(int phase, int registeredParties) {
				if (phase > 1) {
					System.out.println("Phaser Terminated : "+this.isTerminated());
					return true;
				}
				System.out.println("Phaser Terminated : "+this.isTerminated());
				return false;
			}
		};

		new Thread(new GameTask(phaser, 4L), "Player 1").start();
		new Thread(new GameTask(phaser, 2L), "Player 2").start();
		new Thread(new GameTask(phaser, 3L), "Player 3").start();
		new Thread(new GameTask(phaser, 1L), "Player 4").start();

		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		phaser.register();
		phaser.arriveAndDeregister();
		System.out.printf("Arrived at stage No %d by thread %s and deregistered also.%n", phaser.getPhase(),
				Thread.currentThread().getName());
		// phaser.arriveAndAwaitAdvance();

		
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// phaser.forceTermination();
		System.out.println("Phaser Terminated : "+phaser.isTerminated());
	}
}

class GameTask implements Runnable {

	Phaser phaser = null;
	long timeout = 0L;

	public GameTask(Phaser phaser, long timeout) {
		this.phaser = phaser;
		this.timeout = timeout;
		this.phaser.register();
	}

	public void run() {
		demoThree();
		// demoTwo();
		// demoOne();
	}

	public void demoThree() {
		// 20 loc
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Gaming stage %d is reached by thread %s%n", this.phaser.getPhase(),
				Thread.currentThread().getName());
		this.phaser.arriveAndAwaitAdvance();
		/*
		 * try { this.phaser.awaitAdvanceInterruptibly(this.phaser.getPhase(),
		 * 2, TimeUnit.SECONDS); } catch (InterruptedException |
		 * TimeoutException e1) { e1.printStackTrace(); }
		 */
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Arrived at Gaming stage No %d by thread %s%n", this.phaser.getPhase(),
				Thread.currentThread().getName());
		this.phaser.arriveAndAwaitAdvance();
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Arrived at Gaming stage No %d by thread %s%n", this.phaser.getPhase(),
				Thread.currentThread().getName());
		this.phaser.arriveAndAwaitAdvance();
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Moving to Gaming stage No %d by thread %s%n", this.phaser.getPhase(),
				Thread.currentThread().getName());
	}

	public void demoTwo() {
		// 20 loc
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Gaming stage %d is reached by thread %s%n", this.phaser.getPhase(),
				Thread.currentThread().getName());
		this.phaser.arriveAndAwaitAdvance();
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Arrived at Gaming stage No %d by thread %s%n", this.phaser.getPhase(),
				Thread.currentThread().getName());
		this.phaser.arriveAndAwaitAdvance();
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Arrived at Gaming stage No %d by thread %s%n", this.phaser.getPhase(),
				Thread.currentThread().getName());
		if (Thread.currentThread().getName().equals("Player 3")) {
			this.phaser.arriveAndDeregister();
			System.out.printf("Party  %s left in stage %d and remaining parties still there in phaser are %d%n",
					Thread.currentThread().getName(), this.phaser.getPhase(), this.phaser.getRegisteredParties());
			return;
		}
		this.phaser.arriveAndAwaitAdvance();
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Moving to Gaming stage No %d by thread %s%n", this.phaser.getPhase(),
				Thread.currentThread().getName());
	}

	public void demoOne() {
		// 20 loc
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Gaming stage %d is reached by thread %s%n", this.phaser.getPhase(),
				Thread.currentThread().getName());
		this.phaser.arriveAndAwaitAdvance();
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Arrived at Gaming stage No %d by thread %s%n", this.phaser.getPhase(),
				Thread.currentThread().getName());
		this.phaser.arriveAndAwaitAdvance();
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Moving to Gaming stage No %d by thread %s%n", this.phaser.getPhase(),
				Thread.currentThread().getName());

	}
}
