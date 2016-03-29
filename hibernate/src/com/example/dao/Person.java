package com.example.dao;

public class Person{

	int uid;
	String name;
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