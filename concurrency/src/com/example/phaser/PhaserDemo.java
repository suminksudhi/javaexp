package com.example.phaser;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class PhaserDemo {
	
	public static void main(String[] args) {
		new PhaserDemo();
	}
	
	public PhaserDemo() {
		Phaser phaser = new Phaser();
		
		new Thread(new GamingTask(phaser,4L),"Player 1").start();
		new Thread(new GamingTask(phaser,2L),"Player 2").start();
		new Thread(new GamingTask(phaser,3L),"Player 3").start();
		new Thread(new GamingTask(phaser,1L),"Player 4").start();
		
	}
}

class GamingTask implements Runnable{

	Phaser phaser = null;
	long timeout = 0L;
	
	public GamingTask(Phaser phaser,long timeout) {
		this.phaser = phaser;
		this.timeout = timeout;
		this.phaser.register();
	}
	
	public void run() {
		//20 loc
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Gaming stage %d is reached by thread %s%n",this.phaser.getPhase(),Thread.currentThread().getName());
		this.phaser.arriveAndAwaitAdvance();
		try {
			TimeUnit.SECONDS.sleep(this.timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Moving to Gaming stage No %d by thread %s%n",this.phaser.getPhase(),Thread.currentThread().getName());
	}
}
