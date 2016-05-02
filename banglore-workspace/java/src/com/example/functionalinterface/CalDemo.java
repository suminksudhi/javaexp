package com.example.functionalinterface;

public class CalDemo {
	
	public static void main(String[] args) {
		new CalDemo();
	}

	public CalDemo() {
		demoThree();
		demoTwo();
		demoOne();
	}

	private void demoThree(){
		Calculator.doWork(100, 5, (a,b)-> System.out.println(a+b));
		Calculator.doWork(100, 5, (a,b)-> System.out.println(a-b));
		Calculator.doWork(100, 5, (a,b)-> System.out.println(a*b));
		Calculator.doWork(100, 5, (a,b)-> System.out.println(a/b));
	}

	private void demoTwo(){
		doWork(100, 5, (a,b)-> System.out.println(a+b));
		doWork(100, 5, (a,b)-> System.out.println(a-b));
		doWork(100, 5, (a,b)-> System.out.println(a*b));
		doWork(100, 5, (a,b)-> System.out.println(a/b));
	}

	private void demoOne(){
		ICalServie sumService = (a,b)-> System.out.println(a+b);
		ICalServie diffService = (a,b)-> System.out.println(a-b);
		ICalServie multiplyService = (a,b)-> System.out.println(a*b);
		ICalServie divideService = (a,b)-> System.out.println(a/b);
		
		sumService.calculate(10, 2);
		diffService.calculate(10, 2);
		multiplyService.calculate(10, 2);
		divideService.calculate(10, 2);
	}
	
	public void doWork(int i,int j,ICalServie servie){
		servie.calculate(i, j);
	}
	
}
