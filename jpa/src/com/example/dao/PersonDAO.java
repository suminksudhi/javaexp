package com.example.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


public class PersonDAO{

	public static void delete(EntityManagerFactory factory){

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
		
			
			Person p1 = entityManager.find(Person.class, 5);
			entityManager.remove(p1);
			
			
		tx.commit();
		entityManager.close();
		
	
	}


	
	
	public static void update(EntityManagerFactory factory){

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
		
			Person p1 = new Person();
			p1.setUid(1);
			p1.setName("Mohan");
			p1.setAge(39);

			entityManager.merge(p1);
		
			//Person person = entityManager.find(Person.class, new Integer(2));
			//person.setName("Raj Kumar");
			//person.setAge(24);
			
		tx.commit();
		entityManager.close();
	}

	
	public static void read(EntityManagerFactory factory){

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
		
			Person person = entityManager.find(Person.class, new Integer(3));
			System.out.println(person.getUid());
			System.out.println(person.getName());
			System.out.println(person.getAge());

			
		tx.commit();
		entityManager.close();
	}

	
	public static void save(EntityManagerFactory factory){

		Person p1 = new Person();
		p1.setName("Raj");
		p1.setAge(34);

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
		
			entityManager.persist(p1);
			System.out.println(p1.getUid());

		tx.commit();
		entityManager.close();
		
	}

} 