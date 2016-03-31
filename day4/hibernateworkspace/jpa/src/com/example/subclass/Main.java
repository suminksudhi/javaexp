package com.example.subclass;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		//JPA started
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql-unit");
		
		AllDAO.readAll(factory);
		//AllDAO.saveFurniture(factory);
		//AllDAO.saveChair(factory);
		//AllDAO.saveDesk(factory);
		
		//JPA stopped
		factory.close();
		
	}
}
