package com.example.component;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_detail")
public class Teacher {

	int id;
	String name;
	double salary;
	int age;
	Address address;

	public Teacher() {
	}

	public Teacher(String name, double salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public Teacher(int id, String name, double salary, int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	@Id
	@Column(name = "t_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(length = 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Embedded
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", address=" + address
				+ "]";
	}
	
	

}
