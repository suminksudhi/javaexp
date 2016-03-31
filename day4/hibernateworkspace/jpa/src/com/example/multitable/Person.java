package com.example.multitable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name = "person_master")
@SecondaryTables({ 
	@SecondaryTable(name = "education_detail"), 
	@SecondaryTable(name = "family_detail") 
	})
public class Person {

	// Personal Info
	int uid;
	String name;
	int age;
	String phone;

	// Educational Info
	String grad;
	String postGrad;
	int gradPert;
	int postPradPert;

	// Family Info
	String mother;
	String father;
	String spouse;
	int children;

	public Person() {
	}

	public Person(String name, int age, String phone, String grad, String postGrad, int gradPert, int postPradPert,
			String mother, String father, String spouse, int children) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.grad = grad;
		this.postGrad = postGrad;
		this.gradPert = gradPert;
		this.postPradPert = postPradPert;
		this.mother = mother;
		this.father = father;
		this.spouse = spouse;
		this.children = children;
	}

	public Person(int uid, String name, int age, String phone, String grad, String postGrad, int gradPert,
			int postPradPert, String mother, String father, String spouse, int children) {
		this.uid = uid;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.grad = grad;
		this.postGrad = postGrad;
		this.gradPert = gradPert;
		this.postPradPert = postPradPert;
		this.mother = mother;
		this.father = father;
		this.spouse = spouse;
		this.children = children;
	}

	@Id
	@Column(name = "u_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Column(length = 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(length = 10)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(length = 20,table="education_detail")
	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	@Column(length = 20,table="education_detail")
	public String getPostGrad() {
		return postGrad;
	}

	public void setPostGrad(String postGrad) {
		this.postGrad = postGrad;
	}

	
	@Column(table="education_detail")
	public int getGradPert() {
		return gradPert;
	}

	public void setGradPert(int gradPert) {
		this.gradPert = gradPert;
	}

	
	@Column(table="education_detail")
	public int getPostPradPert() {
		return postPradPert;
	}

	public void setPostPradPert(int postPradPert) {
		this.postPradPert = postPradPert;
	}

	@Column(length = 20,table="family_detail")
	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	@Column(length = 20,table="family_detail")
	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	@Column(length = 20,table="family_detail")
	public String getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	@Column(table="family_detail")
	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Person [uid=" + uid + ", name=" + name + ", age=" + age + ", phone=" + phone + ", grad=" + grad
				+ ", postGrad=" + postGrad + ", gradPert=" + gradPert + ", postPradPert=" + postPradPert + ", mother="
				+ mother + ", father=" + father + ", spouse=" + spouse + ", children=" + children + "]";
	}

}
