package com.example.enumex;

public class SeasonDemo {

	public static void main(String[] args) {
		
		System.out.println(Season.SPRING);
		int arr[] = Season.SPRING.getValues();
		for(int month :  arr){
			System.out.println("Month : "+month);
		}
			
		
	}
}