package com.example.one2many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_detail")
public class Employee {
	
	int id;
	String name;
	long salary;
	
	public Employee() {
	}
	
	
	public Employee(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	public Employee(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Id
	@Column(name = "e_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Column(length=20,nullable=false)
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
	
	

}
