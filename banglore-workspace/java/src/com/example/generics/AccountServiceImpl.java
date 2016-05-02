package com.example.generics;

import java.time.LocalTime;

public class AccountServiceImpl<T extends Account,V> implements IAccountService<T>{

	public void bankDetails(V details) {
		System.out.println(details);
	}

	
	public T openAccount(T account) {
		account.setStatus(true);
		account.setId(LocalTime.now().getNano() * Runtime.getRuntime().freeMemory()
				* Runtime.getRuntime().availableProcessors());
		return account;
	}

	public T closeAccount(T account) {
		account.setStatus(false);
		return account;
	}

	public double deposit(double amount) {
		return 1500000.00;
	}

	public double withdraw(double amount) {
		return 1.00;
	}

	public double balance(int id) {
		return 1200000000000.00;
	}

}