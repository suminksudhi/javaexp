package com.example.hql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class QBCDAO {

	
	public static void readBySalary(EntityManagerFactory factory) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

			
			CriteriaBuilder builder = entityManager.getCriteriaBuilder();		
			CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);
			Root<Employee> root = criteriaQuery.from(Employee.class);
			
			//Predicate condition1 = builder.lt(root.get("salary"),10000L);
			Predicate condition1 = builder.gt(root.get("salary"),30000L);
			Predicate condition2 = builder.equal(root.get("dept"),"COE");
			
			Predicate condition3 = builder.or(condition1, condition2);
			criteriaQuery.where(condition3);
			
			//criteriaQuery.where(condition1,condition2);
			
			Query query = entityManager.createQuery(criteriaQuery);					
			
			List<Employee> list = query.getResultList();
			for(Employee employee :  list){
				System.out.println(employee);
			}
			
		tx.commit();
		entityManager.close();

	}

	
	
	public static void readAll(EntityManagerFactory factory) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

			
			CriteriaBuilder builder = entityManager.getCriteriaBuilder();		
			CriteriaQuery<Company> criteriaQuery = builder.createQuery(Company.class);
			criteriaQuery.from(Company.class);
			
			Query query = entityManager.createQuery(criteriaQuery);					
			
			List<Company> list = query.getResultList();
			for(Company company :  list){
				System.out.println(company);
			}
			
		tx.commit();
		entityManager.close();

	}

}
