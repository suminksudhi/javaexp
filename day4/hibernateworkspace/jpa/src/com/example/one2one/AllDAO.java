package com.example.one2one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class AllDAO {
	
	public static void saveAll(EntityManagerFactory factory){
		
		Employee e1 = new Employee("Abhishek", 59000);
		Address address = new Address("Pune", "MH");
		
		e1.setAddress(address);
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
		
			
			entityManager.persist(e1);
		
			
		tx.commit();
		entityManager.close();
		
	}

}
