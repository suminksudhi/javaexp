package com.example.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class PersonDAO{
	
	public static void save(EntityManagerFactory entityManagerFactory,Person p1){
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
			entityManager.persist(p1);
		tx.commit();
		entityManager.close();
	}
	
}