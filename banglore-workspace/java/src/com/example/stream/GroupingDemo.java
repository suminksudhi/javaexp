package com.example.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingDemo {

	public static void main(String[] args) {
		new GroupingDemo();
	}

	public GroupingDemo() {
		demoFour();
		demoThree();
		demoTwo();
		demoOne();
	}

	private void demoFour() {

	}

	private void demoThree() {

		Map<String, Map<String, List<Employee>>>  map = Employee.employees().stream().collect(Collectors.groupingBy(Employee::getState,Collectors.groupingBy(Employee::getCity)));
		map.forEach((state,values)->{
			System.out.printf("==================== %s ================= %n",state);
			values.forEach((city,employees)->{
				System.out.printf("==================== %s ================= %n",city);
				employees.forEach((emp)-> { 
					System.out.printf("Name --- %s ,  Desig ----- %s%n",emp.getName(),emp.getDesig());
				});
			});
		
		});
		
		System.out.println("===============================================");

	}

	private void demoTwo() {

		Map<String, List<Employee>>  map = Employee.employees().stream().collect(Collectors.groupingBy(Employee::getState));
		map.forEach((state,employees)->{
			System.out.printf("==================== %s ================= %n",state);
			employees.forEach((emp)-> { 
				System.out.printf("Name --- %s ,  Desig ----- %s%n",emp.getName(),emp.getDesig());
			});
		});
		
		System.out.println("===============================================");
		
	}

	private void demoOne() {
		
		Map<String, List<Employee>>  map = Employee.employees().stream().collect(Collectors.groupingBy(  emp -> emp.getState()));
		map.forEach((state,employees)->{
			System.out.printf("==================== %s ================= %n",state);
			employees.forEach((emp)-> { 
				System.out.printf("Name --- %s ,  Desig ----- %s%n",emp.getName(),emp.getDesig());
			});
		});
		
		System.out.println("===============================================");
	}

	public void show(String arg) {
		System.out.printf("Filtered Name : %s%n", arg);
	}
}
