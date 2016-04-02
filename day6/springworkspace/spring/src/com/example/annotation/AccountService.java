package com.example.annotation;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
@Lazy
public class AccountService {

	@Autowired(required=false)
	AccountDAO accountDAO;
	
	//@Resource
	AccountDAO account;
		
	public void openAccount(){
		accountDAO.save();
		account.save();
		System.out.println("Account is opened successfully!");
	}

	public void deposit(){
		account.save();
		accountDAO.save();
		System.out.println("Amount deposited!");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("init()");
	}
	
	
}
