package com.example.inher;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
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
