package com.example.optional;

import java.util.Optional;

import com.example.stream.Employee;

public class OptionalDemo {
	
	public static void main(String[] args) {
		new OptionalDemo();
	}
	
	public OptionalDemo() {
		demoOne();
	}
	
	private void demoOne(){
		
		Integer i = new Integer(100);

		Optional<Integer> optional = Optional.ofNullable(i);
		if(optional.isPresent()){
			System.out.println(optional.get());
		}
		
		//Optional<Integer> optional = Optional.of(i);
		//System.out.println(optional.get());
		
		
		//Optional<Integer> optional = Optional.empty();
		//System.out.println(optional.get());
		
	}

}