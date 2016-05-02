package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String s[]) {
		new ReduceDemo();
	}

	public ReduceDemo() {
		demoThree();
		demoTwo();
		demoOne();
	}

	private void demoThree() {

		System.out.println("Accumuliting and Reducing values using Java 8 Stream ------ ");
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir", "Pintu",
				"Jaggu", "Ganshu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		String result = names.stream().filter((name)-> name.startsWith("R") ).reduce("Names ---- ",(accValue,name)-> accValue +" ---- "+ name);
		System.out.println(result);
	}


	private void demoTwo() {

		System.out.println("Accumuliting and Reducing values using Java 8 Stream ------ ");
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir", "Pintu",
				"Jaggu", "Ganshu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		String result = names.stream().reduce("Names ---- ",(accValue,name)-> accValue +" ---- "+ name);
		System.out.println(result);
	}


	private void demoOne() {
		System.out.println("Accumuliting and Reducing values using Java 8 Stream ------ ");
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir", "Pintu",
				"Jaggu", "Ganshu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");
		String result = names.stream().reduce((accValue,name)-> accValue +" ---- "+ name).get();
		System.out.println(result);

	}

}
