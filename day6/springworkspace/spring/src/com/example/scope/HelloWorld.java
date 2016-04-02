package com.example.scope;

public class HelloWorld {

	String greeting;
	
	public HelloWorld() {
		System.out.println("Inside constructor");
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void sayHello(){
		System.out.println(this.greeting+" Spring....");
	}
	
	public void init() {
		System.out.println("Inside HelloWorld.init()");
		System.out.printf("Printing : %s%n",this.greeting);
	}


}
