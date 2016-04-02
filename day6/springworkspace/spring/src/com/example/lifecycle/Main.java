package com.example.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//IOC Container is started
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/lifecycle/appCxt.xml");
		
			HelloWorld world = (HelloWorld) context.getBean("hello");
			world.sayHello();
			
			AccountService accountService = context.getBean("accountService",AccountService.class);
			accountService.openAccount();
			accountService.deposit();
			
			LibraryService libraryService = context.getBean("libraryService",LibraryService.class);
			libraryService.listBooks();
			libraryService.issueBook();
			
		//IOC Container is stopped
		context.destroy();
		context.close();
		
		
	}
}
