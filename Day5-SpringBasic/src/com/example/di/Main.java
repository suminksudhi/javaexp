package com.example.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//IOC container start
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/di/appCxt.xml");
		
		//HelloWorld helloWorld = new HelloWorld();
		//helloWorld.sayHello();
		
			//container lookups
			HelloWorld world =context.getBean("hello",HelloWorld.class);
			world.sayHello();
			
			HelloWorld world1 =context.getBean("hello1",HelloWorld.class);
			world1.sayHello();
		
		//IOC container close
		context.destroy();
		//avoid memory leak with IOC container
		context.close();
		
	}

}
