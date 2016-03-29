package com.example.many2many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class AllDAO {
	
	
	public static void saveStudent(EntityManagerFactory factory){
		
		Student s1 = new Student("Laden", 34);
					
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
			
			Course c1 = entityManager.find(Course.class, 1);
			s1.getCourses().add(c1);	
			
			entityManager.persist(s1);
			
		tx.commit();
		entityManager.close();
		
	}



	
	public static void saveAll(EntityManagerFactory factory){
		
		Student s1 = new Student("Rohan", 24);
		Student s2 = new Student("Mohan", 20);
		
		Course c1 = new Course("Hibernate",(short)24);
		Course c2 = new Course("Spring",(short)40);
		Course c3 = new Course("DOJO",(short)60);
		
		s1.getCourses().add(c1);
		s1.getCourses().add(c2);
		s1.getCourses().add(c3);
		
		s2.getCourses().add(c1);
		s2.getCourses().add(c2);
		
			
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
			
			entityManager.persist(s1);
			entityManager.persist(s2);
					
		tx.commit();
		entityManager.close();
		
	}

}
