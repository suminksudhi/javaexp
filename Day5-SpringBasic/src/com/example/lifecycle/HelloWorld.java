package com.example.lifecycle;

public class HelloWorld {
	
	public void init(){
		System.out.println("Inside HelloWorld init()");
	}
	
	public void sayHello(){
		System.out.println("testme");
	}
	
	public void destroy(){
		System.out.println("Inside HelloWorld destroy()");
	}
}
