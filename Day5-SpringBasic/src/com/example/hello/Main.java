package com.example.hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//IOC container start
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/exmaple/hello/applicationContext.xml");
		
		//HelloWorld helloWorld = new HelloWorld();
		//helloWorld.sayHello();
		
			//container lookups
			HelloWorld world = (HelloWorld) context.getBean("hello");
			world.sayHello();
		
		//IOC container close
		context.destroy();
		//avoid memory leak with IOC container
		context.close();
		
	}

}
