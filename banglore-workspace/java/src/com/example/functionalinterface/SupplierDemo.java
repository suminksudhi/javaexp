package com.example.functionalinterface;

import java.util.function.IntBinaryOperator;

public class SupplierDemo {

	public static void main(String[] args) {
		new SupplierDemo();
	}
	
	public SupplierDemo() {
		demoOne();
	}
	
	private void demoOne(){
		IntBinaryOperator operator = (a,b) -> a*b ;
		int rs = operator.applyAsInt(10, 2);
		System.out.println(rs);
	}

}