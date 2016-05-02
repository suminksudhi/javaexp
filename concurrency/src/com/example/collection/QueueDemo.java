package com.example.collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueDemo {

	public static void main(String[] args) {
		new QueueDemo();
	}

	public QueueDemo() {
		//demoOne();
		//demoTwo();
		demoThree();
	}

	
	private void demoThree() {

		Queue<Employee> employees = new PriorityQueue<>((emp1,emp2) -> emp1.getAge() - emp2.getAge());
		employees.offer(new Employee("ROhan",23));
		employees.offer(new Employee("MOhan",73));
		employees.offer(new Employee("SOhan",13));
		employees.offer(new Employee("Raj",3));
		employees.offer(new Employee("Rahul",83));
		
		System.out.println(employees);
		
		/*
		for(Employee emp : employees){
			System.out.println(emp);
		}
		*/
	
	}

	
	private void demoTwo() {

		Queue<Integer> integers = new PriorityQueue<>();
		integers.offer(520);
		integers.offer(420);
		integers.offer(3);
		integers.offer(120);
		integers.offer(320);

		for(Integer i : integers){
			System.out.println(i);
		}
		
		/*
		System.out.println(integers.peek());
		System.out.println(integers);
		System.out.println(integers.poll());
		System.out.println(integers);
		 */
	
	}

	private void demoOne() {

		Queue<Integer> integers = new ConcurrentLinkedQueue<>();
		integers.offer(120);
		integers.offer(320);
		integers.offer(420);
		integers.offer(520);

		System.out.println(integers.peek());
		System.out.println(integers);
		System.out.println(integers.poll());
		System.out.println(integers);
	}

}
