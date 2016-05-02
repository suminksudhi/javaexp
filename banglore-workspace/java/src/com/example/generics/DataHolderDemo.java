package com.example.generics;

public class DataHolderDemo {
	
	public static void main(String[] args) {
		new DataHolderDemo();
	}
	
	public DataHolderDemo() {
		demoTwo();
		//demoOne();
	}

	private void demoTwo(){
		
		DataHolder<String,Integer> holder1 = new DataHolder<String,Integer>("Cat",100);
		holder1.display();
		System.out.println(holder1.read());
		System.out.println(holder1.readSize());
		

		DataHolder<Integer,Long> holder2 = new DataHolder<Integer,Long>(120,10000L);
		holder2.display();
		System.out.println(holder2.read());
		System.out.println(holder2.readSize());
		
		
		DataHolder<Product,Short> holder3 = new DataHolder<Product,Short>(new Product(100, "Pen", 120.00),new Short("14"));
		holder3.display();
		System.out.println(holder3.read());
		System.out.println(holder3.readSize());
	
	}
	
	private void demoOne(){
		DataHolder holder1 = new DataHolder("Lion");
		holder1.display();

		DataHolder holder2 = new DataHolder(120000);
		holder2.display();
	}
}