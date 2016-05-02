package com.example.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import org.apache.derby.impl.sql.catalog.SYSROUTINEPERMSRowFactory;

public class TAdjusterDemo {

	public static void main(String[] args) {
		System.out.println("Helllo.......................");
		new TAdjusterDemo();
	}

	public TAdjusterDemo() {
		demoOne();
	}

	private void demoOne() {

		LocalDate currentDate = LocalDate.now();
		System.out.printf("Current Date : %s%n", currentDate);

		currentDate = currentDate.withMonth(6).with(TemporalAdjusters.firstDayOfMonth()).with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY))
				.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.printf("Current Date : %s%n", currentDate);

		
		currentDate = currentDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY))
				.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.printf("Current Date : %s%n", currentDate);

		currentDate = currentDate.with(TemporalAdjusters.firstDayOfYear());
		System.out.printf("Current Date : %s%n", currentDate);

	}
}