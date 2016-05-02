package com.example.stream;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	int id;
	String name;
	double salary;
	String desig;
	String dept;
	String city;
	String state;
	
	public Employee() {
	}
	
	public Employee(int id, String name, double salary, String desig, String dept, String city, String state) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desig = desig;
		this.dept = dept;
		this.city = city;
		this.state = state;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", desig=" + desig + ", dept=" + dept
				+ ", city=" + city + ", state=" + state + "]";
	}

	public static List<Employee> employees(){
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1,"Jaggu", 45000.00, "Terrorist", "Bombers", "Lahore", "Sindh Pakistan"));
		employees.add(new Employee(2,"Ganshu", 56000.00, "Terrorist", "Terror", "Karachi", "Punjab Pakistan"));
		employees.add(new Employee(3,"Kallu", 15000.00, "Goon", "Bombers", "Lahore", "Sindh Pakistan"));
		employees.add(new Employee(4,"Kali Charan", 89000.00, "Goon", "Secret", "Karachi", "Punjab Pakistan"));
		employees.add(new Employee(5,"Pintu", 34000.00, "Terrorist", "Terror", "Karachi", "Punjab Pakistan"));
		employees.add(new Employee(6,"Rose Gulabo", 38000.00, "Sardar", "Secret", "Lahore", "Sindh Pakistan"));
		employees.add(new Employee(7,"Chandu Patiala", 85000.00, "Terrorist", "Terror", "Karachi", "Punjab Pakistan"));
		employees.add(new Employee(8,"Mohini", 14000.00, "Jr. Thief", "Terror", "Karachi", "Punjab Pakistan"));
		employees.add(new Employee(9,"Kalu Khatharnak", 95000.00, "Goon", "Secret", "Lahore", "Sindh Pakistan"));
		employees.add(new Employee(10,"Rancho", 65000.00, "Sr. Thief", "Terror", "Hyderabad", "Sindh Pakistan"));
		employees.add(new Employee(11,"Gabbar Singh", 90000.00, "Terrorist", "Terror", "Lahore", "Sindh Pakistan"));
		employees.add(new Employee(12,"Johni Gaddar", 56000.00, "Goon", "Secret", "Hyderabad", "Sindh Pakistan"));
		employees.add(new Employee(13,"Ramu", 40000.00, "Terrorist", "Terror", "Lahore", "Sindh Pakistan"));
		employees.add(new Employee(14,"Laden Humble", 99000.00, "The Boss", "Bombers", "Hyderabad", "Sindh Pakistan"));
		employees.add(new Employee(15,"Dawood Boss", 25000.00, "The Boss", "Bombers", "Lahore", "Sindh Pakistan"));
		return employees;
	}
	
}