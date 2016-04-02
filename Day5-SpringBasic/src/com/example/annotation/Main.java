package com.example.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.annotation.AccountService;

public class Main {

	public static void main(String[] args) {
		
		//IOC container start
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/annotation/appCxt.xml");
		

			//container lookups
			AccountService accountService = context.getBean("accountService",AccountService.class);
			accountService.depositAmount();
			
		//IOC container close
		context.destroy();
		//avoid memory leak with IOC container
		context.close();
		
	}

}
