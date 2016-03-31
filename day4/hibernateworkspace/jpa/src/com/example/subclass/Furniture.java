package com.example.subclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="furniture_detail")
@Inheritance(strategy=InheritanceType.JOINED)
public class Furniture {
	
	int id;
	String material;
	double price;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="f_id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(length=20)
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Furniture [id=" + id + ", material=" + material + ", price=" + price + "]";
	}
	
	
	

}
