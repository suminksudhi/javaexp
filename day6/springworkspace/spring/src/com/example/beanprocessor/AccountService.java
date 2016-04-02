package com.example.beanprocessor;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
@Author(name="Laden")
public class AccountService {
		
	@Test
	public void openAccount(){
		System.out.println("Account is opened successfully!");
	}

	@Test
	public void deposit(){
		System.out.println("Amount deposited!");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Inside AccountService.init()");
	}
	
}
