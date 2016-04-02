package com.example.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//IOC container start
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/lifecycle/appCxt.xml");
		
		//HelloWorld helloWorld = new HelloWorld();
		//helloWorld.sayHello();
		
			//container lookups
			HelloWorld world = (HelloWorld) context.getBean("hello");
			world.sayHello();
			
			
			AccountService accountService = context.getBean("accountService",AccountService.class);
			accountService.depositAmount();
			

			LibraryService libraryService = context.getBean("libraryService",LibraryService.class);
			libraryService.listNext();
		
		//IOC container close
		context.destroy();
		//avoid memory leak with IOC container
		context.close();
		
	}

}
