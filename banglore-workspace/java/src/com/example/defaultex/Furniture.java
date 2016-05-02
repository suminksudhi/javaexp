package com.example.defaultex;

public interface Furniture {

	public abstract void make();
	public abstract void paint();

	static void showRoom(){
		System.out.println("Furniture showroom is in Mumbai!");
	}
	
	default void breakIt(){
		System.out.println("Furniture is already broken!");
	}
		
}
