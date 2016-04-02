package com.example.zero;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(ApplicationConfig.class);
		
			HelloWorld helloWorld= context.getBean("helloWorld",HelloWorld.class);
			helloWorld.sayHello("Rohan");
	
			Employee employee = context.getBean("employee",Employee.class);
			System.out.println(employee);
					
			AccountService accountService = context.getBean("accountService",AccountService.class);
			accountService.openAccount();
			accountService.deposit();
			
			LibraryService libraryService = context.getBean("libraryService",LibraryService.class);
			libraryService.listBooks();
			libraryService.issueBook();
		
	
		
		context.destroy();
		context.close();
		
		
	}
}
