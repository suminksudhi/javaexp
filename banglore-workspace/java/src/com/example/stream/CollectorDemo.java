package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorDemo {

	public static void main(String[] args) {
		new CollectorDemo();
	}

	public CollectorDemo() {
		demoSeven();
		demoSix();
		demoFive();
		demoFour();
		demoThree();
		demoTwo();
		demoOne();
	}

	
	private void demoSeven(){
		
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		String result = names.stream().filter(name -> name.length() > 7).collect(Collectors.joining(" | ","Employee Names :  "," ---- "));
		System.out.println(result);
		System.out.println("===============================================");
	}

	
	private void demoSix(){
		
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		String result = names.stream().filter(name -> name.length() > 7).collect(Collectors.joining(" | "));
		System.out.println(result);
		System.out.println("===============================================");
	}

	
	private void demoFive(){
		
		List<Integer> integers = Arrays.asList(23,65,34,78,5,23,45,9,87,54,23);
		double result = integers.stream().collect(Collectors.averagingInt( a-> a*a));
		System.out.println(result);
		System.out.println("===============================================");
	}

	
	private void demoFour(){
		
		List<Integer> integers = Arrays.asList(23,65,34,78,5,23,45,9,87,54,23);
		//int result = integers.stream().map( value -> value*value ).collect(Collectors.summingInt( a-> a ));
		int result = integers.stream().collect(Collectors.summingInt( a-> a*a ));
		System.out.println(result);
		System.out.println("===============================================");
	}

	
	private void demoThree(){
		
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		long result = names.stream().map(name -> name.toUpperCase()).collect(Collectors.counting());
		System.out.println(result);
		System.out.println("===============================================");
	}

	private void demoTwo(){
		
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");
		Set<String> result = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toSet());
		System.out.println(result);
		System.out.println("===============================================");
	}

	private void demoOne(){
	
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");
		List<String> result = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(result);
		System.out.println("===============================================");
	}
	
	public void show(String arg){
		System.out.printf("Filtered Name : %s%n",arg);
	}
}