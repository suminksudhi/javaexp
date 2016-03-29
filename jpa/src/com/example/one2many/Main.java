package com.example.one2many;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		//JPA started
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql-unit");
		
			AllDAO.readAll(factory);
			//AllDAO.saveEmployee(factory);
			//AllDAO.saveAll(factory);
		
		//JPA stopped
		factory.close();
		
	}
}
