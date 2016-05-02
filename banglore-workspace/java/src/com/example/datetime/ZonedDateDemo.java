package com.example.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateDemo {

	public static void main(String[] args) {
		new ZonedDateDemo();
	}

	public ZonedDateDemo() {
		demoOne();
	}

	private void demoOne() {

		ZonedDateTime currentDate = ZonedDateTime.now();
		System.out.printf("Current Date : %s%n", currentDate);
	
		ZoneId zone = ZoneId.of("Asia/Karachi");
		
		currentDate = ZonedDateTime.now(zone);
		System.out.printf("Current Date : %s%n", currentDate);

		currentDate = ZonedDateTime.now(ZoneId.of("Asia/Dhaka"));
		System.out.printf("Current Date : %s%n", currentDate);

		currentDate = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.printf("Current Date : %s%n", currentDate);

	}
}
