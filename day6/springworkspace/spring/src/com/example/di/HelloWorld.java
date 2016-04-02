package com.example.di;

public class HelloWorld {

	String greeting;
	
	public HelloWorld() {
	}

	public HelloWorld(String greeting) {
		this.greeting = greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void sayHello(){
		System.out.println(this.greeting+" Spring....");
	}
	
}
