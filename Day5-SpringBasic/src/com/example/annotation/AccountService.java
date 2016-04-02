package com.example.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
	
	@PostConstruct
	public void init(){
		System.out.println("AccountService init");
	}
	
	@PreDestroy
	public void clean(){
		System.out.println("AccountService delete");
	}
	
	public void openAccount(){
		accountDAO.save();
		System.out.println("account openeded successfully");
	}
	
	public void depositAmount(){
		System.out.println("deposited money successfully");
	}

}
