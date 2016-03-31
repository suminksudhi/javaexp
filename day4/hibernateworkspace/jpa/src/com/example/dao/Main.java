package com.example.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		//JPA started
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql-unit");
		
		PersonDAO.delete(factory);
		
		//PersonDAO.update(factory);
		//PersonDAO.read(factory);
		//PersonDAO.save(factory);
		
		//JPA stopped
		factory.close();
		
	}
}
