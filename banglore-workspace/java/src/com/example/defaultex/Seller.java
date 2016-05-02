package com.example.defaultex;

public interface Seller {
	
	void sellIt();
	
	default void breakIt(){
		System.out.println("Seller broke the furniture!");
	}
	

}
