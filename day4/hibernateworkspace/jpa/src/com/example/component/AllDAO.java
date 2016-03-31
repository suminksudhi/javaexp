package com.example.component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class AllDAO {

	
	public static void readTeacher(EntityManagerFactory factory) {


		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

			Teacher teacher = entityManager.find(Teacher.class, 1);
			System.out.println(teacher);
			
		tx.commit();
		entityManager.close();

	}


	
	
	public static void saveTeacher(EntityManagerFactory factory) {

		Teacher teacher = new Teacher("Ram", 240000, 27);
		Address address = new Address("Banglore", "KA");
		teacher.setAddress(address);

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		entityManager.persist(teacher);

		tx.commit();
		entityManager.close();

	}

}
