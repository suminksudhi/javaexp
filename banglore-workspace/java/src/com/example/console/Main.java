package com.example.console;

import java.io.Console;

public class Main {

	public static void main(String[] args) {
		
		Console console = System.console();
		if(console != null){
			
			String name = console.readLine("Enter user name  :");
			String pass = new String(console.readPassword("Enter password  :"));
			
			console.printf("Hello Mr %s and your password is public now : %s", name,pass);
			
		}else{
			System.out.println("No Console available");
		}
		
		
	}
}