package com.example.subclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class AllDAO {

	
	public static void readAll(EntityManagerFactory factory) {

		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

			Furniture furniture = entityManager.find(Furniture.class,2);
			System.out.println(furniture);
		
			//Chair chair = entityManager.find(Chair.class,2);
			//System.out.println(chair);
			
		tx.commit();
		entityManager.close();

	}

	
	
	public static void saveDesk(EntityManagerFactory factory) {

		Desk desk = new Desk();
		desk.setMaterial("Iron");
		desk.setPrice(8000.00);
		desk.setSurface(40);
		desk.setDrawer(5);
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		entityManager.persist(desk);

		tx.commit();
		entityManager.close();

	}

	
	public static void saveChair(EntityManagerFactory factory) {

		Chair chair = new Chair();
		chair.setMaterial("Plastic");
		chair.setPrice(34000.00);
		chair.setHand(2);
		chair.setLeg(4);
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		entityManager.persist(chair);

		tx.commit();
		entityManager.close();

	}

	public static void saveFurniture(EntityManagerFactory factory) {

		Furniture furniture = new Furniture();
		furniture.setMaterial("Wood");
		furniture.setPrice(24000.00);

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		entityManager.persist(furniture);

		tx.commit();
		entityManager.close();

	}

}
