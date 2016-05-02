package com.example.defaultex;

public class Desk implements Furniture,Seller{

	public void make() {
		System.out.println("Desk is ready.....");
	}
	
	public void paint() {
		System.out.println("Desk is painted .....");
	}
	
	public void sellIt() {
		System.out.println("Desk is already sold!");
	}
	
	public void breakIt(){
		Furniture.showRoom();
		Furniture.super.breakIt();
		Seller.super.breakIt();
		System.out.println("Desk is already broken!");
	}

}
