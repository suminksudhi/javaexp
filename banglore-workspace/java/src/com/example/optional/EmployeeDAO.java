package com.example.optional;

import java.util.Optional;

import com.example.stream.Employee;

public class EmployeeDAO {

	public Employee readById(int id) {
		//20 loc jdbc
		return new Employee();
	}

	public Optional<Employee> read(int id) {
		//20 loc jdbc
		return Optional.ofNullable(new Employee());
	}

}
