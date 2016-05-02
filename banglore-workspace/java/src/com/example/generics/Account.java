package com.example.generics;

public class Account {

	long id;
	String name;
	double amount;
	boolean status;

	public Account() {
	}

	public Account(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}

	public Account(String name, double amount, boolean status) {
		this.name = name;
		this.amount = amount;
		this.status = status;
	}


	public Account(long id, String name, double amount, boolean status) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.status = status;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", amount=" + amount + ", status=" + status + "]";
	}


}