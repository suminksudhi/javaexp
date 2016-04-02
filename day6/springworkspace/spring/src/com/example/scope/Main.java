package com.example.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//IOC Container is started
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/scope/appCxt.xml");
		
			//Client 1
			//HelloWorld helloWorld1 = context.getBean("helloWorld",HelloWorld.class);
			//System.out.println(helloWorld1);
			//helloWorld1.sayHello();
		
			//Client 2
			//HelloWorld helloWorld2 = context.getBean("helloWorld",HelloWorld.class);
			//System.out.println(helloWorld2);
			//helloWorld2.sayHello();
		
			
		//IOC Container is stopped
		context.destroy();
		context.close();
		
		
	}
}
