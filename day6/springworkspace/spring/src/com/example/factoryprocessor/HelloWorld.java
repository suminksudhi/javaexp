package com.example.factoryprocessor;

public class HelloWorld {

	String greeting;

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void sayHello(String name) {
		System.out.println(this.greeting+" "+name);
	}

}
