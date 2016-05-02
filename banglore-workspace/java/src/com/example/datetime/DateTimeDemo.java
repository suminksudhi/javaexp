package com.example.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {

	public static void main(String[] args) {
		new DateTimeDemo();
	}

	public DateTimeDemo() {
		demoOne();
	}
	
	private void demoOne(){

		LocalDateTime currentDate = LocalDateTime.now();
		System.out.printf("Current Date : %s%n",currentDate);

		LocalDate date = currentDate.toLocalDate();
		System.out.printf("Current Date : %s%n",date);

		LocalTime time = currentDate.toLocalTime();
		System.out.printf("Current Date : %s%n",time);

		
		currentDate = currentDate.minusMonths(10);
		System.out.printf("Current Date : %s%n",currentDate);

		
		currentDate = LocalDateTime.of(2010, 2, 12, 12, 7);
		System.out.printf("Current Date : %s%n",currentDate);

		
		

	}
}
