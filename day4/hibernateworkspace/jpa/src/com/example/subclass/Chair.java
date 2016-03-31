package com.example.subclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="chair_detail")
public class Chair extends Furniture{

	int hand;
	int leg;
	
	
	public int getHand() {
		return hand;
	}
	public void setHand(int hand) {
		this.hand = hand;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	@Override
	public String toString() {
		return super.toString()+"  Chair [hand=" + hand + ", leg=" + leg + "]";
	}
	
	
	
	
}
