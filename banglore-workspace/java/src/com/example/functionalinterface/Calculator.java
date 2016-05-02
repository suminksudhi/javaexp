package com.example.functionalinterface;

public class Calculator {
	public static void doWork(int i,int j,ICalServie servie){
		servie.calculate(i, j);
	}
}
