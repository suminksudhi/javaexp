package com.example.one2many.bi;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		//JPA started
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql-unit");
		
			AllDAO.saveAll(factory);
			//AllDAO.readEmployee(factory);
			//AllDAO.readCompany(factory);
		
		//JPA stopped
		factory.close();
		
	}
}
