package com.example.generics;

public class CurrentAccount extends Account {

	double odLimit = 0.0;

	public CurrentAccount(String name, double amount, double odLimit) {
		super(name, amount);
		this.odLimit = odLimit;
	}

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

	public String toString() {
		return super.toString() + " CurrentAccount [odLimit=" + odLimit + "]";
	}

}
