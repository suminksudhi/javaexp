package com.example.underscore;

public class Main {
	
	public static void main(String[] args) {

		long i = 18970000000L;
		long j = 18_970_000_000L;
		
		System.out.println("I : "+i);
		System.out.println("J : "+j);
		
		if(i == j){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
				
	}

}
