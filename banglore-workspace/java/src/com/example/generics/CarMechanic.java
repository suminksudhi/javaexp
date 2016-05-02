package com.example.generics;

public class CarMechanic<T extends Car & Acceleratable & Brakeable> {

	T car;

	public CarMechanic(T car) {
		this.car = car;
	}

	public void fixIt() {
		System.out.println("CarMechanic is fixing.... and testing.....");
		this.car.run();
		this.car.accelerate();
		this.car.brake();
	}

}
