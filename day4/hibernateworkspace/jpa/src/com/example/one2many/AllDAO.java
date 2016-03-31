package com.example.one2many;

import java.util.Iterator;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class AllDAO {

	public static void readAll(EntityManagerFactory factory){
		
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
					
			Company company = entityManager.find(Company.class, 2);
			/*System.out.println(company.getId());
			System.out.println(company.getName());
			System.out.println(company.getStrength());
			Set set = company.getEmployees();
			Iterator itr = set.iterator();
			while(itr.hasNext()){
				Employee e = (Employee)itr.next();
				System.out.println(e.getId());
				System.out.println(e.getName());
				System.out.println(e.getSalary());
						
			}*/
			
		tx.commit();
		entityManager.close();
	
		
		Set set = company.getEmployees();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Employee e = (Employee)itr.next();
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
					
		}
		
	}

	
	
	public static void saveEmployee(EntityManagerFactory factory){
		
		Employee e1 = new Employee("Praveen", 99000);
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
					
			Company company = entityManager.find(Company.class, 2);
			company.getEmployees().add(e1);
			
		tx.commit();
		entityManager.close();
		
	}
	
	
	public static void saveAll(EntityManagerFactory factory){
		
		Company c1 = new Company("Synechron",10000);
		
		Employee e1 = new Employee("Abhishek", 59000);
		Employee e2 = new Employee("Sumin", 79000);
		
		c1.getEmployees().add(e1);
		c1.getEmployees().add(e2);
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
		
			
			entityManager.persist(c1);
		
			
		tx.commit();
		entityManager.close();
		
	}

}
