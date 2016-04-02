package com.example.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/factory/appCxt.xml");
		
			Employee employee = (Employee) context.getBean("employee");
			System.out.println(employee);
			
		context.destroy();
		context.close();
		
		
	}
}
