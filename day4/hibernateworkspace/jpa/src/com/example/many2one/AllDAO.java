package com.example.many2one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class AllDAO {

	public static void saveAll(EntityManagerFactory factory) {

		Member m1 = new Member("Abhishek", "9862626262");
		Member m2 = new Member("Raj", "9862626278");

		Club club = new Club("Club Mahindra", "Pune");

		m1.setClub(club);
		m2.setClub(club);

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		entityManager.persist(m1);
		entityManager.persist(m2);

		tx.commit();
		entityManager.close();

	}

}
