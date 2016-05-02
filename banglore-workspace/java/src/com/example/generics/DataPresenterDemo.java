package com.example.generics;

public class DataPresenterDemo {

	public static void main(String[] args) {
		new DataPresenterDemo();
	}

	public DataPresenterDemo() {
		demoFour();
		//demoThree(); 
		//demoTwo();
		//demoOne();
	}

	private void demoFour() {

		DataPresenter dataPresenter = new DataPresenter();
		dataPresenter.manipulateData(1290);
	}
	
	private void demoThree() {

		DataPresenter dataPresenter = new DataPresenter();
		dataPresenter.showMoreData("Laptop", 150,450);
		dataPresenter.showMoreData("Laptop", 150,450L);
		dataPresenter.showMoreData("Laptop",450L,100);
		
	}

	private void demoTwo() {

		DataPresenter dataPresenter = new DataPresenter();
		dataPresenter.showData("Laptop", 150);
		dataPresenter.showData("Laptop", "HP");
			
	}

	private void demoOne() {
		DataPresenter presenter = new DataPresenter();
		presenter.show("Red");
		presenter.show(189);
		presenter.show(new Product(100, "Mobile", 1345.00));
		
	}
}
