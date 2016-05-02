package com.example.staticex;

import static java.lang.System.*; 
import static java.lang.Thread.*; 

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello........");
		out.println("Hello........");
		try {
			Thread.sleep(4000);
			sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
