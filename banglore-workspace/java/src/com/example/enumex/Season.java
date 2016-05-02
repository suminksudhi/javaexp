package com.example.enumex;

public enum Season {

	WINTER(11,12,1),SUMMER(2,3,4),SPRING(5,6,7),RAINY(8,9,10);
	
	private int month[] = new int[3];
	
	private Season(){
		System.out.println("Inside Season()");
	}
	
	private Season(int m1,int m2,int m3){
		System.out.println("Inside Season(int m1,int m2,int m3)");
		month[0] = m1;
		month[1] = m2;
		month[2] = m3;
	}
	
	public int[] getValues(){
		return this.month;
	}
}