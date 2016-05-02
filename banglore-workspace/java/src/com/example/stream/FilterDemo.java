package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		new FilterDemo();
	}

	public FilterDemo() {
		demoThree();
		demoTwo();
		demoOne();
	}

	private void demoThree(){
		
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		//names.stream().filter( name -> name.contains("l")).forEach(System.out::println);
		names.stream().filter( name -> name.contains("l")).forEach(this::show);
		System.out.println("===============================================");
	}

	private void demoTwo(){
		
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		names.stream().filter( name -> name.startsWith("R")).forEach(System.out::println);
		System.out.println("===============================================");
	}

	private void demoOne(){
	
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");
		//names.stream().filter((name)->name.length() > 9).forEach((name)->{System.out.println(name);});
		names.stream().filter( name -> name.length() > 9).forEach(System.out::println);
		System.out.println("===============================================");
	}
	
	public void show(String arg){
		System.out.printf("Filtered Name : %s%n",arg);
	}
}