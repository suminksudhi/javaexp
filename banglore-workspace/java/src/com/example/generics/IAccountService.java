package com.example.generics;

public interface IAccountService<T extends Account> {

	public T openAccount(T account);
	public T closeAccount(T account);
	public double deposit(double amount);
	public double withdraw(double amount);
	public double balance(int id);

}
