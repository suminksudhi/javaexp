package com.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AccountService implements InitializingBean,DisposableBean{

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside AccountService.afterPropertiesSet()");
	}
	
	public void destroy() throws Exception {
		System.out.println("Inside AccountService.destroy()");
	}
	
	public void openAccount(){
		System.out.println("Account is opened successfully!");
	}


	public void deposit(){
		System.out.println("Amount deposited!");
	}

	
}
