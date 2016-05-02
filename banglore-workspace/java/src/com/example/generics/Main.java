package com.example.generics;

public class Main {

	public static void main(String[] args) {

		Car car = new Car();
		BMW bmw = new BMW();
		Audi audi = new Audi();
		Bus bus = new Bus();
		Aeroplane aeroplane = new Aeroplane();

		// CarMechanic<Car> mechanic1 = new CarMechanic<>(car);
		// mechanic1.fixIt();

		CarMechanic<BMW> mechanic2 = new CarMechanic<>(bmw);
		mechanic2.fixIt();

		CarMechanic<Audi> mechanic3 = new CarMechanic<>(audi);
		mechanic3.fixIt();

		/*
		 * CarMechanic<Bus> mechanic4 = new CarMechanic<>(bus);
		 * mechanic4.fixIt();
		 * 
		 * CarMechanic<Aeroplane> mechanic5 = new CarMechanic<>(aeroplane);
		 * mechanic5.fixIt();
		 */

	}
}