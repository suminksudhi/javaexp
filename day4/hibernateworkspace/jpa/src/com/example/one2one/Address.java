package com.example.one2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address_master")
public class Address {

	int id;
	String city;
	String state;

	public Address() {
	}

	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public Address(int id, String city, String state) {
		this.id = id;
		this.city = city;
		this.state = state;
	}

	@Id
	@Column(name = "a_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(length = 20)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(length = 20)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
