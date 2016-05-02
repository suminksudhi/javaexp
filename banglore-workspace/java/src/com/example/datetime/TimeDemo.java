package com.example.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeDemo {

	public static void main(String[] args) {
		new TimeDemo();
	}

	public TimeDemo() {
		demoOne();
	}
	
	private void demoOne(){

		LocalTime currentTime = LocalTime.now();
		System.out.printf("Current Time : %s%n",currentTime);

		currentTime = currentTime.withHour(9);
		System.out.printf("Current Time : %s%n",currentTime);

		currentTime = currentTime.minus(12, ChronoUnit.MINUTES);
		System.out.printf("Current Time : %s%n",currentTime);

		
		currentTime = LocalTime.of(10, 8, 12);
		System.out.printf("Current Time : %s%n",currentTime);

		currentTime = LocalTime.of(10, 8, 12, 200);
		System.out.printf("Current Time : %s%n",currentTime);

		currentTime = LocalTime.of(12,45);
		System.out.printf("Current Time : %s%n",currentTime);

		currentTime = LocalTime.ofSecondOfDay(29270);
		System.out.printf("Current Time : %s%n",currentTime);

		currentTime = LocalTime.parse("12:09:34");
		System.out.printf("Current Time : %s%n",currentTime);
	
		currentTime = LocalTime.parse("12:09:34");
		System.out.printf("Current Time : %s%n",currentTime);
	

	}
}