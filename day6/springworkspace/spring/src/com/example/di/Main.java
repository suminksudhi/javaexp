package com.example.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//IOC Container is started
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/di/appCxt.xml");
		
			HelloWorld helloWorld1 = context.getBean("hello1",HelloWorld.class);
			HelloWorld helloWorld2 = context.getBean("hello2",HelloWorld.class);

			helloWorld1.sayHello();
			helloWorld2.sayHello();
			
		//IOC Container is stopped
		context.destroy();
		context.close();
		
		
	}
}
