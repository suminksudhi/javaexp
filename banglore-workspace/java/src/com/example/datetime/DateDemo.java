package com.example.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateDemo {

	public static void main(String[] args) {
		new DateDemo();
	}

	public DateDemo() {
		demoOne();
	}
	
	private void demoOne(){

		LocalDate currentDate = LocalDate.now();
		System.out.printf("Current Date : %s%n",currentDate);

		currentDate = currentDate.withYear(2020);
		System.out.printf("Current Date : %s%n",currentDate);

		currentDate = currentDate.minusWeeks(14);
		System.out.printf("Current Date : %s%n",currentDate);

		currentDate = currentDate.plusDays(12);
		System.out.printf("Current Date : %s%n",currentDate);
		
		
		currentDate = currentDate.plus(5, ChronoUnit.CENTURIES);
		System.out.printf("Current Date : %s%n",currentDate);

		currentDate = currentDate.plus(2, ChronoUnit.DECADES);
		System.out.printf("Current Date : %s%n",currentDate);

		currentDate = currentDate.plus(10, ChronoUnit.MONTHS);
		System.out.printf("Current Date : %s%n",currentDate);

		currentDate = currentDate.plus(10, ChronoUnit.DAYS);
		System.out.printf("Current Date : %s%n",currentDate);

		
		System.out.printf("Current Month : %s%n",currentDate.getMonthValue());
		System.out.printf("Current Month : %s%n",currentDate.getMonth());
		System.out.printf("Current Year : %s%n",currentDate.getYear());
		System.out.printf("Current Day : %s%n",currentDate.getDayOfMonth());
		System.out.printf("Current Day : %s%n",currentDate.getDayOfWeek());
		System.out.printf("Current Day : %s%n",currentDate.getDayOfYear());
		

		currentDate = LocalDate.of(2010, 3, 12);
		System.out.printf("Current Date : %s%n",currentDate);

		currentDate = LocalDate.of(2010, Month.NOVEMBER, 15);
		System.out.printf("Current Date : %s%n",currentDate);

		currentDate = LocalDate.ofYearDay(2005,168);
		System.out.printf("Current Date : %s%n",currentDate);
	
		currentDate = LocalDate.parse("2014-08-12");
		System.out.printf("Current Date : %s%n",currentDate);
	

	}
}