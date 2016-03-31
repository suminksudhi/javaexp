package com.example.component;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		//JPA started
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql-unit");
		
		
		AllDAO.readTeacher(factory);
		//AllDAO.saveTeacher(factory);
		
		//JPA stopped
		factory.close();
		
	}
}
