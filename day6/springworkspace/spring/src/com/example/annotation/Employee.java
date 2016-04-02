package com.example.annotation;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	//@Value("100")
	//@Value("#{uniqueGenerator.generate()}")
	//@Value("#{(new java.util.Date().getSeconds())}")
	@Value("#{10+20}")
	int id;
		
	@Value("Ram")
	String name;
	
	//@Value("10/02/1934")
	@Value("#{new java.text.SimpleDateFormat(\"dd-MM-yyyy\").format(new java.util.Date())}")
	String dob;
	

	Map<String, Address> map;

	
	
	
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Map<String, Address> getMap() {
		return map;
	}

	@Autowired
	public void setMap(Map<String, Address> map) {
		this.map = map;
	}
	
	
	
	
	/*
	List<Address> addresses;

	public List<Address> getAddresses() {
		return addresses;
	}

	@Autowired
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}*/	
	
	
	/*
	Address address[];

	public Address[] getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address[] address) {
		this.address = address;
	}*/
		
		
	/*
	Address home;
	Address office;

	public Address getHome() {
		return home;
	}
	
	public Address getOffice() {
		return office;
	}

	@Autowired
	public void writeAddress(@Qualifier("addr1") Address home,@Qualifier("addr2") Address office) {
		this.home = home;
		this.office = office;
	}*/
	
	
	/*
	public Address getHome() {
		return home;
	}
	
	@Autowired
	//@Qualifier("addr1")
	public void setHome(Address home) {
		this.home = home;
	}
	
	public Address getOffice() {
		return office;
	}
	
	@Autowired
	//@Qualifier("addr2")
	public void setOffice(Address office) {
		this.office = office;
	}
	
	*/
	
	
	
	/*
	Address address;

	public Address readAddress() {
		return this.address;
	}

	@Autowired
	public void writeAddress(Address address) {
		this.address = address;
	}*/

	
	/*
	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}*/

}
