package com.example.generics;

public class SavingAccount extends Account{
	
	double withrawLimit=0.0;
	
	public SavingAccount(String name, double amount,double withrawLimit) {
		super(name,amount);
		this.withrawLimit = withrawLimit;
	}

	public double getWithrawLimit() {
		return withrawLimit;
	}

	public void setWithrawLimit(double withrawLimit) {
		this.withrawLimit = withrawLimit;
	}

	public String toString() {
		return super.toString()+"  SavingAccount [withrawLimit=" + withrawLimit + "]";
	}
	
}
