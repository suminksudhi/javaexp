package com.example.collection;

import java.util.concurrent.CopyOnWriteArrayList;

public class ListDemo {
	
	public static void main(String[] args) {
		new ListDemo();
	}
	
	public ListDemo() {
		demoOne();
	}
	
	private void demoOne(){
		
		CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();
		integers.add(100);
		integers.add(200);
		integers.add(300);
		
		integers.stream().forEach(System.out::println);
		
	}

}
