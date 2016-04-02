package com.example.annotation;


/**
 * dependency types
 * user defined
 * system defined
 * primitive
 * array
 * collection
 * 
 * dependency injection  types
 * setter base dependency
 * 
 * @author User
 *
 */
public class HelloWorld {
	
	String greetings;
	
	
	public HelloWorld() {
	}
	
	public HelloWorld(String greetings) {
		this.greetings = greetings;
	}

	public void sayHello(){
		System.out.println(this.greetings+" from spring");
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	
	
}
