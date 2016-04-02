package com.example.beanprocessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/beanprocessor/appCxt.xml");
			
			/*AccountService accountService = context.getBean("accountService",AccountService.class);
			accountService.openAccount();
			accountService.deposit();

			LibraryService libraryService = context.getBean("libraryService",LibraryService.class);
			libraryService.listBooks();
			libraryService.issueBook();
			 */
		
		context.destroy();
		context.close();
		
		
	}
}
