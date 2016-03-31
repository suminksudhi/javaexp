package com.example.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person_detail")
public class Person{

	@Id
	@Column(name="u_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int uid;

	@Column(name="u_name",length=16)
	String name;
	
	@Column(name="u_age")
	int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(int uid, String name, int age) {
		this.uid = uid;
		this.name = name;
		this.age = age;
	}


	public int getUid(){
		return this.uid;
	}	
	
	public void setUid(int uid){
		this.uid = uid;
	}	

	public String getName(){
		return this.name;
	}	
	
	public void setName(String name){
		this.name = name;
	}	

	public int getAge(){
		return this.age;
	}	
	
	public void setAge(int age){
		this.age = age;
	}	

}