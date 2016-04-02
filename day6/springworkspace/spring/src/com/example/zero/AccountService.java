package com.example.zero;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountService {
	
	@Autowired
	AccountDAO accountDAO;

	@PostConstruct
	public void init(){
		System.out.println("Inside AccountService.init()!");
	}

	public void openAccount(){
		accountDAO.save();
		System.out.println("Account is opened successfully!");
	}

	public void deposit(){
		accountDAO.save();
		System.out.println("Amount deposited!");
	}
	
}
