package com.example.enumex;

public class Person {

	int id;
	String name;
	Month month;

	public Person() {
	}

	public Person(String name, Month month) {
		this.name = name;
		this.month = month;
	}

	public Person(int id, String name, Month month) {
		this.id = id;
		this.name = name;
		this.month = month;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", month=" + month + "]";
	}

}
