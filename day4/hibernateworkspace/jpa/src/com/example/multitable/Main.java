package com.example.multitable;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		//JPA started
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql-unit");
		
			AllDAO.savePerson(factory);
		
		//JPA stopped
		factory.close();
		
	}
}
