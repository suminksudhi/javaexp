package com.example.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorDemo {

	public static void main(String[] args) {
		new ScheduleExecutorDemo();
	}

	public ScheduleExecutorDemo() {
		demoOne();
	}

	private void demoOne() {

		//ScheduledExecutorService executor = new ScheduledThreadPoolExecutor(1);
		ScheduledExecutorService executor =  Executors.newScheduledThreadPool(10);
		executor.schedule(new EmailTask(), 5, TimeUnit.SECONDS);
		executor.schedule(()->{ System.out.println("Plane is already flying at 10000 feet."); }, 3, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(()->{ System.out.println("Vodafone SMS service will be down for 2 hours.");}, 4, 5, TimeUnit.SECONDS);
	}

}

class EmailTask implements Runnable {

	public void run() {
		System.out.println("Email has been sent to ISI.");
	}
}
