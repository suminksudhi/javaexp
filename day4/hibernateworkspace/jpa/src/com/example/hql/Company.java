package com.example.hql;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company_detail")
public class Company {

	int id;
	String name;
	int strength;
	Set<Employee> employees = new HashSet<>();

	public Company() {

	}

	public Company(String name, int strength) {
		this.name = name;
		this.strength = strength;
	}

	public Company(int id, String name, int strength) {
		this.id = id;
		this.name = name;
		this.strength = strength;
	}

	@Id
	@Column(name = "c_id")
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

	@Column(length = 4)
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@OneToMany(mappedBy="company",cascade = CascadeType.PERSIST)
	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", strength=" + strength + "]";
	}
	
	
	

}
