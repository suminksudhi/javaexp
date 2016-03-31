package com.example.one2many.bi;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


public class AllDAO {

	

	
	public static void saveAll(EntityManagerFactory factory){
		
		Company c1 = new Company("CSC",50000);
		
		Employee e1 = new Employee("Ram", 19000);
		Employee e2 = new Employee("Shyam", 9000);
		
		/*c1.getEmployees().add(e1);
		c1.getEmployees().add(e2);
		
		e1.setCompany(c1);
		e2.setCompany(c1);
		*/
		
		c1.addEmployee(e1);
		c1.addEmployee(e2);
				
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
		
			
			entityManager.persist(c1);
		
			
		tx.commit();
		entityManager.close();
		
		
		
		
	}


	
	
	public static void readEmployee(EntityManagerFactory factory){
				
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
					
			Employee  employee= entityManager.find(Employee.class, 3);
			System.out.println(employee);
			System.out.println(employee.getCompany());
			
			
		tx.commit();
		entityManager.close();
	
		
	}

	
	
	public static void readCompany(EntityManagerFactory factory){
		
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx= entityManager.getTransaction();
		tx.begin();
					
			Company company = entityManager.find(Company.class, 2);
			System.out.println(company);
			Set<Employee> employees =company.getEmployees();
			for(Employee employee : employees){
				System.out.println(employee);
			}
			
		tx.commit();
		entityManager.close();
	
		
	}

	
}
