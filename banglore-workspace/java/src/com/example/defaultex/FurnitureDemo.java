package com.example.defaultex;

public class FurnitureDemo {

	public static void main(String[] args) {
		

		Furniture.showRoom();
		
		Furniture furniture = new Desk();
		furniture.make();
		furniture.paint();
		furniture.breakIt();
		
		Desk desk = new Desk();
		desk.make();
		desk.paint();
		desk.breakIt();
		
		
		
	}
}
