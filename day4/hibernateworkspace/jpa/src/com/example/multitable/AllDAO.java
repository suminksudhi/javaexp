package com.example.multitable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class AllDAO {

	public static void savePerson(EntityManagerFactory factory) {

		Person person = new Person("Rohan", 28, "9282262626", "BTech", "Mtech", 85, 90, "Rohini", "Shyam", "Ritu", 2);

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

			entityManager.persist(person);

		tx.commit();
		entityManager.close();

	}

}
