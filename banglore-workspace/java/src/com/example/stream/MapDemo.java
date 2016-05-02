package com.example.stream;

import java.util.Arrays;
import java.util.List;

import org.apache.derby.impl.sql.catalog.SYSROUTINEPERMSRowFactory;

public class MapDemo {

	public static void main(String[] args) {
		new MapDemo();
	}

	public MapDemo() {
		demoFour();
		demoThree();
		demoTwo();
		demoOne();
	}

	private void demoFour(){
		
		List<Integer> integers = Arrays.asList(23,65,34,78,5,23,45,9,87,54,23);
		integers.stream().map( value -> value*value ).forEach(System.out::println);
		System.out.println("===============================================");
	}

	
	private void demoThree(){
		
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		names.stream().map( name -> name.substring(3)).forEach(this::show);
		System.out.println("===============================================");
	}

	private void demoTwo(){
		
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		names.stream().map(name -> name.length()).forEach(System.out::println);
		System.out.println("===============================================");
	}

	private void demoOne(){
	
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");
		names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
		System.out.println("===============================================");
	}
	
	public void show(String arg){
		System.out.printf("Filtered Name : %s%n",arg);
	}
}