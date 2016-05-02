package com.example.enumex;

public class EnumDemo {

	public static void main(String[] args) {

		Person person1 = new Person(100, "Kallu", Month.JAN);
		System.out.println(person1);

		Person person2 = new Person(200, "Raju", Month.DEC);
		System.out.println(person2);

		System.out.println(person1.getMonth());

		System.out.println(Month.NOV.ordinal());
		System.out.println(Month.NOV.name());

		Month months[] = Month.values();
		for (Month month : months) {
			System.out.println(month);
		}

	}

}