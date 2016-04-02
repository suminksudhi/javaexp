package com.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//adding lifecycle support using InitializingBean
public class AccountService implements InitializingBean,DisposableBean {
	
	public void openAccount(){
		System.out.println("account openeded successfully");
	}
	
	public void depositAmount(){
		System.out.println("deposited money successfully");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("called AccountService  afterPropertiesSet()");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("called AccountService  destroy()");
	}

}
