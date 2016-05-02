package com.example.generics;

import java.time.LocalTime;

public class AccountServiceImpl_bak implements IAccountService<Account> {

		
	public Account openAccount(Account account) {
		account.setStatus(true);
		account.setId(LocalTime.now().getNano()*Runtime.getRuntime().freeMemory()*Runtime.getRuntime().availableProcessors());
		return account;
	}

	public Account closeAccount(Account account) {
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
