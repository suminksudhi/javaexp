package com.example.referencemethod;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.UnaryOperator;

public class NewAPIDemo {

	public static void main(String[] args) {
		new NewAPIDemo();
	}

	public NewAPIDemo() {
		demoSeven();
		demoSix();
		demoFive();
		demoFour();
		demoThree();
		demoTwo();
		demoOne();
	}


	private void demoSeven() {
		List<String> names = new CopyOnWriteArrayList<String>(new String[]{"Raj", "Mohan", "Chandu", "Ghansu", "Pintu", "Lalu", "Kalia",
				"Kallu Khatarnak", "Laden Boss", "Dawood Bhai"});
		//names.replaceAll((name)-> name.toUpperCase());
		names.replaceAll((name)-> name.substring(3));
		System.out.println(names);
		System.out.println();
		System.out.println("=========================================");
	}

	
	private void demoSix() {
		List<String> names = new CopyOnWriteArrayList<String>(new String[]{"Raj", "Mohan", "Chandu", "Ghansu", "Pintu", "Lalu", "Kalia",
				"Kallu Khatarnak", "Laden Boss", "Dawood Bhai"});
		names.sort((s1,s2)-> s1.length() - s2.length());
		System.out.println(names);
		System.out.println();
		System.out.println("=========================================");
	}

	private void demoFive() {
		List<String> names = new CopyOnWriteArrayList<String>(new String[]{"Raj", "Mohan", "Chandu", "Ghansu", "Pintu", "Lalu", "Kalia",
				"Kallu Khatarnak", "Laden Boss", "Dawood Bhai"});
		//names.removeIf((name)-> name.contains("D"));
		names.removeIf((name)-> name.length() > 6);
		System.out.println(names);
		System.out.println();
		System.out.println("=========================================");
	}

	private void demoFour() {
		List<String> names = Arrays.asList("Raj", "Mohan", "Chandu", "Ghansu", "Pintu", "Lalu", "Kalia",
				"Kallu Khatarnak", "Laden Boss", "Dawood Bhai");
		names.forEach(PrintUtil::show);
		System.out.println();
		System.out.println("=========================================");
	}

	private void demoThree() {
		List<String> names = Arrays.asList("Raj", "Mohan", "Chandu", "Ghansu", "Pintu", "Lalu", "Kalia",
				"Kallu Khatarnak", "Laden Boss", "Dawood Bhai");
		names.forEach(this::show);
		System.out.println();
		System.out.println("=========================================");
	}

	private void demoTwo() {
		List<String> names = Arrays.asList("Raj", "Mohan", "Chandu", "Ghansu", "Pintu", "Lalu", "Kalia",
				"Kallu Khatarnak", "Laden Boss", "Dawood Bhai");
		names.forEach(System.out::println);
		System.out.println("=========================================");
	}

	private void demoOne() {
		List<String> names = Arrays.asList("Raj", "Mohan", "Chandu", "Ghansu", "Pintu", "Lalu", "Kalia",
				"Kallu Khatarnak", "Laden Boss", "Dawood Bhai");
		names.forEach((name) -> System.out.println(name));
		System.out.println("=========================================");
	}

	public void show(String name) {
		System.out.printf("Name : %s  |  ", name);
	}

}