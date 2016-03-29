package com.example.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args){
		
		Person p1 = new Person();
		p1.setUid(100);
		p1.setName("Sumin");
		p1.setAge(25);
		
		String persistenceUnitName = "mysql-unit";
		//JPA bootstrapping use entityManager
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
		PersonDAO.save(entityManagerFactory,p1);
		entityManagerFactory.close();
		
	}
}













