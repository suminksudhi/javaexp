package com.example.factory;

public class EmployeeFactory {

	public Employee newInstance() {
		return new Employee(2000, "Mohan", 22);
	}
}
