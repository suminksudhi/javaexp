package com.example.one2one;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		//JPA started
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql-unit");
		
		AllDAO.saveAll(factory);
		
		//JPA stopped
		factory.close();
		
	}
}
