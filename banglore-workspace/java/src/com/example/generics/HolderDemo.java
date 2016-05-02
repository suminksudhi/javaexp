package com.example.generics;

public class HolderDemo {
	
	public static void main(String[] args) {
		new HolderDemo();
	}
	
	public HolderDemo() {
		//demoTwo();
		demoOne();
	}

	private void demoTwo(){
	}
	
	private void demoOne(){
		
		Holder<Long> holder1 = new Holder<Long>(12L);
		holder1.display();
		
		Holder<Integer> holder2 = new Holder<Integer>(120);
		holder2.display();
		
	}
}
