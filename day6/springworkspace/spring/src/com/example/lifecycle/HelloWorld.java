package com.example.lifecycle;

public class HelloWorld {

	public void init(){
		System.out.println("Inside HelloWorld.init()");
	}

	public void clean(){
		System.out.println("Inside HelloWorld.clean()");
	}

	public void sayHello(){
		System.out.println("Hello Spring....");
	}
	
}
