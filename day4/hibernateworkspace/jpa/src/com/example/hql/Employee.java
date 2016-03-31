package com.example.hql;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "employee_detail")
@NamedQueries({
	@NamedQuery(name="allEmployees",query="from Employee"),
	@NamedQuery(name="bySalary",query="from Employee where salary >= :sal"),
	@NamedQuery(name="byDesig",query="from Employee where desig = :des")
})
public class Employee {

	int id;
	String name;
	long salary;
	String desig;
	String dept;
	Company company;

	public Employee() {
	}

	public Employee(String name, long salary, String desig, String dept) {
		this.name = name;
		this.salary = salary;
		this.desig = desig;
		this.dept = dept;
	}

	public Employee(int id, String name, long salary, String desig, String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desig = desig;
		this.dept = dept;
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

	@Column(length = 20, nullable = false)
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

	@Column(length = 20)
	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	@Column(length = 20)
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="c_id")
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", desig=" + desig + ", dept=" + dept
				+ "]";
	}

}
