package com.example.factoryprocessor;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/factoryprocessor/appCxt.xml");
			
			HelloWorld helloWorld = context.getBean("helloWorld",HelloWorld.class);
			helloWorld.sayHello("Sachin Tendulkar");
		
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
