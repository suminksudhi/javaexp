package com.example.stringswitch;

public class Main {
	
	public static void main(String[] args) {
		
		String color = "RED";
		
		switch (color) {
		case "RED":
			System.out.println("RED is shine color!");
			break;
		case "GREEN":
			System.out.println("GREEN is peace color!");
			break;
		default:
			System.out.println("All color are cool!");
			break;
		}
		
	}

}