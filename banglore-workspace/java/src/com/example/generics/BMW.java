package com.example.generics;

public class BMW extends Car implements Acceleratable,Brakeable{
	

	public void run(){
		System.out.println("BMW is running.....");
	}

	public void accelerate() {
		System.out.println("BMW is speeding up........");
	}
	
	public void brake() {
		System.out.println("BMW is speeding down.....");
	}
	
}
