package com.example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonDemo {

	public static void main(String[] args) {
		new PersonDemo();
	}

	public PersonDemo() {
		//demoOne();
		//demoTwo();
		demoThree();
	}

	private void demoThree(){
		Person person1 = new Person(10, "Raj", 23);
		Person person2 = new Person(20, "Rohan", 67);
		Person person3 = new Person(30, "Jaggu", 17);
		Person person4 = new Person(40, "Chandu", 56);
		Person person5 = new Person(50, "Pintu", 23);
		Person person6 = new Person(60, "Ghanshu", 12);
		
		List<Person> persons = new ArrayList<>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);
		
		Collections.sort(persons,(p1, p2) -> p1.getName().compareTo(p2.getName()));
		
		/*Collections.sort(persons,(p1, p2) -> {
				if(p1.getAge() == p2.getAge())
					return 0;
				else if(p1.getAge() < p2.getAge())
					return -1;
				else
					return 1;
		});*/

		for(Person person : persons){
			System.out.println(person);
		}

	}

	
	private void demoTwo(){
		Person person1 = new Person(10, "Raj", 23);
		Person person2 = new Person(20, "Rohan", 67);
		Person person3 = new Person(30, "Jaggu", 17);
		Person person4 = new Person(40, "Chandu", 56);
		Person person5 = new Person(50, "Pintu", 23);
		Person person6 = new Person(60, "Ghanshu", 12);
		
		List<Person> persons = new ArrayList<>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);
		
		Collections.sort(persons,new Comparator<Person>() {

			public int compare(Person p1, Person p2) {
				if(p1.getAge() == p2.getAge())
					return 0;
				else if(p1.getAge() < p2.getAge())
					return -1;
				else
					return 1;
			}
		
		});

		for(Person person : persons){
			System.out.println(person);
		}

	}

	private void demoOne(){
		Person person1 = new Person(10, "Raj", 23);
		Person person2 = new Person(20, "Rohan", 67);
		Person person3 = new Person(30, "Jaggu", 17);
		Person person4 = new Person(40, "Chandu", 56);
		Person person5 = new Person(50, "Pintu", 23);
		Person person6 = new Person(60, "Ghanshu", 12);
		
		List<Person> persons = new ArrayList<>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);
		
		Collections.sort(persons,new AgeComparator());

		for(Person person : persons){
			System.out.println(person);
		}

	}
}

class AgeComparator implements Comparator<Person>{

	public int compare(Person p1, Person p2) {
		if(p1.getAge() == p2.getAge())
			return 0;
		else if(p1.getAge() < p2.getAge())
			return -1;
		else
			return 1;
	}
}
