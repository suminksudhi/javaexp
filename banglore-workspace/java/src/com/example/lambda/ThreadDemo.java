package com.example.lambda;

public class ThreadDemo {

	public static void main(String[] args) {
		new ThreadDemo();
	}
	
	public ThreadDemo() {
		demoFour();
		demoThree();
		demoTwo();
		demoOne();
	}

	//Java 8
	private void demoFour(){
		Runnable runnable = ()->{ System.out.println("Printing ....... using lambda"); };
		Thread thread = new Thread(runnable);
		thread.start();
	}

	//Java 8
	private void demoThree(){
		Thread thread = new Thread(()->{ System.out.println("Printing ....... using lambda"); });
		thread.start();
	}

	
	//Before Java 8
	private void demoTwo(){
		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("Printing....... Using Annonymous class");
			}
		});
		thread.start();
	}

	
	//Before Java 8
	private void demoOne(){
		Thread thread = new Thread(new PrintTask());
		thread.start();
	}
}

class PrintTask implements Runnable{

	public void run() {
		System.out.println("Printing........ using sub class");
	}
}