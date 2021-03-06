package com.example.dao;


import javax.persistence.*;

@Entity
@Table(name="person")
public class Person{
	
	@Id
	@Column(name="uid")
	@GeneratedValue(strategy="")
	private int uid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
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