package com.example.singleton;

public enum CEO {
	
	inst;
	
	String name = "Faisal";
	
	public void display(){
		System.out.println("Name : "+name);
	}

}