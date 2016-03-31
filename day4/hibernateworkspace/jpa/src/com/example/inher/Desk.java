package com.example.inher;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("D")
public class Desk extends Furniture{

	int surface;
	int drawer;
	
	
	public int getSurface() {
		return surface;
	}
	public void setSurface(int surface) {
		this.surface = surface;
	}
	public int getDrawer() {
		return drawer;
	}
	public void setDrawer(int drawer) {
		this.drawer = drawer;
	}
	
	@Override
	public String toString() {
		return super.toString()+"  Desk [surface=" + surface + ", drawer=" + drawer + "]";
	}
	
	
	
	
	
}
