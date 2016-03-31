package com.example.component;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	String city;
	String state;

	public Address() {
	}

	public Address(String city, String state) {
		this.city = city;
		this.state = state;
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

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	

}
