package com.example.annotation;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/annotation/appCxt.xml");
			
			Employee employee = context.getBean("employee",Employee.class);
			
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getDob());
			
			Map<String, Address> map = employee.getMap();
			System.out.println(map);
			
			//Address[] arr = employee.getAddress();
			/*List<Address> list = employee.getAddresses();
			for(Address address : list){
				System.out.println(address.getCity());
				System.out.println(address.getState());
			}*/
	
			
			/*System.out.println(employee.getHome().getCity());
			System.out.println(employee.getHome().getState());
			
			System.out.println(employee.getOffice().getCity());
			System.out.println(employee.getOffice().getState());
			*/	
			/*System.out.println(employee.readAddress().getCity());
			System.out.println(employee.readAddress().getState());*/
			
		
			
			/*System.out.println(employee);
			System.out.println(employee.getAddress());
			System.out.println(employee.getAddress().getCity());
			System.out.println(employee.getAddress().getState());*/
			
		context.destroy();
		context.close();
		
	}
}
