package com.example.hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//IOC Container is started
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/hello/applicationContext.xml");
		
			HelloWorld world = (HelloWorld) context.getBean("hello");
			world.sayHello();
			
		//IOC Container is stopped
		context.destroy();
		context.close();
		
		
	}
}
