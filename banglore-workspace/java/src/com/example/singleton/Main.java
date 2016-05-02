package com.example.singleton;

public class Main {

	public static void main(String[] args) {
		
		//Client 1
		CEO ceo1 = CEO.inst;
		System.out.println(ceo1.hashCode());
		ceo1.display();
		
		
		//Client 2
		CEO ceo2 = CEO.inst;
		System.out.println(ceo2.hashCode());
		ceo2.display();
		
		
		assert ceo1 == ceo2;
		
		System.out.println("Life is cool!");
				
	}
}