package com.example.factoryprocessor;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	public void openAccount() {
		System.out.println("Account is opened successfully!");
	}

	public void deposit() {
		System.out.println("Amount deposited!");
	}

}
