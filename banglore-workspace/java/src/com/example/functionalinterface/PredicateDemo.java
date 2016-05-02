package com.example.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.example.lambda.Person;

public class PredicateDemo {

	public static void main(String[] args) {
		new PredicateDemo();		
	}
	
	public PredicateDemo() {
		demoThree();
		//demoTwo();
		//demoOne();
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
		
		validAge(persons, (age)-> age<20);
		validAge(persons, (age)-> age>50);
		validAge(persons, (age)-> age>40);
		validAge(persons, (age)-> age>30);
		
	}
	
	private void demoTwo(){
		Predicate<Integer> predicate = (age) -> { return age > 25; };
		
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
		
		for(Person person :  persons){
			if(predicate.test(person.getAge())){
				System.out.println("Name : "+person.getName());
			}
		}
		
	}
	
	private void demoOne(){
		Predicate<Integer> predicate = (age) -> { return age > 20; };
		System.out.println(predicate.test(25));
		System.out.println(predicate.test(15));
		System.out.println(predicate.test(9));
	}
	
	public void validAge(List<Person> list,Predicate<Integer> predicate){
		for(Person person :  list){
			if(predicate.test(person.getAge())){
				System.out.println("Name : "+person.getName());
			}
		}
	}
	
}
