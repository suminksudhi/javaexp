package com.example.factory;

import org.springframework.beans.factory.FactoryBean;

public class EmployeeSpringFactory implements FactoryBean {

	Employee employee;

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Object getObject() throws Exception {
		//return new Employee(3000, "Jaggu", 29);
		return this.employee;
	}

	public Class getObjectType() {
		return Employee.class;
	}

	public boolean isSingleton() {
		return false;
	}

}
