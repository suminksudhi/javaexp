package com.example.many2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "club_detail")
public class Club {

	int id;
	String name;
	String city;
	public Club(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public Club(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public Club() {
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

	@Column(length=30)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length=30)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
	
	
}
