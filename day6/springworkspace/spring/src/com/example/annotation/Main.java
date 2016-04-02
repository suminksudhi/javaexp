package com.example.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		//IOC Container is started
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/annotation/appCxt.xml");
			
		/*
			HelloWorld world = context.getBean("helloWorld",HelloWorld.class);
			world.sayHello();
		 */
			AccountService accountService1 = context.getBean("accountService",AccountService.class);
			AccountService accountService2 = context.getBean("accountService",AccountService.class);
			
			System.out.println(accountService1);
			System.out.println(accountService2);
			
			//accountService.openAccount();
			//accountService.deposit();
		
			/*	
			LibraryService libraryService = context.getBean("library",LibraryService.class);
			libraryService.listBooks();
			libraryService.issueBook();
			*/
		
		//IOC Container is stopped
		context.destroy();
		context.close();
		
		
	}
}
