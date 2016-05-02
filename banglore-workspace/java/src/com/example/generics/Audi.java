package com.example.generics;

public class Audi extends Car implements Acceleratable,Brakeable{
	

	public void run(){
		System.out.println("Audi is running.....");
	}

	public void brake() {
		System.out.println("Audi is speeding down.....");
	}
	
	public void accelerate() {
		System.out.println("Audi is speeding up........");
	}
}
