package com.example.hql;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class AllDAO {

	
	public static void readNatively(EntityManagerFactory factory) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
	
		Query query = entityManager.createNativeQuery("select * from employee_detail");
			
		List<Object[]> list = query.getResultList();
		for (Object[] arr : list) {
			System.out.println(arr[0]);
			System.out.println(arr[1]);
		}

		tx.commit();
		entityManager.close();
	}
	
	public static void readByCompany(EntityManagerFactory factory) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

				
		//Query query = entityManager.createQuery("select e.name,e.salary from Employee e where e.company.name = 'Synechron'");
		Query query = entityManager.createQuery("select e.name,e.salary,c.name from Employee e,Company c where c.employees.size > 10");

		List<Object[]> list = query.getResultList();
		for (Object[] arr : list) {
			System.out.printf("Name : %s, Salary : %d, Company : %s.%n", arr[0], arr[1],arr[2]);
		}

		
		/*Query query = entityManager
				.createQuery("from Company where name = 'Microsoft'");

		Company company =(Company) query.getSingleResult();
		Set<Employee> set = company.getEmployees();
		for (Employee employee : set) {
			System.out.println(employee);
		}*/

		
		tx.commit();
		entityManager.close();

	}

	
	
	public static void deptBy(EntityManagerFactory factory) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		Query query = entityManager
				.createQuery("select emp.name,max(emp.salary),emp.dept from Employee emp group by emp.dept");

		List<Object[]> list = query.getResultList();
		for (Object[] arr : list) {
			System.out.printf("Name : %s, Salary : %d, Dept : %s%n", arr[0], arr[1], arr[2]);
		}

		tx.commit();
		entityManager.close();

	}

	public static void countAll(EntityManagerFactory factory) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		Query query = entityManager.createQuery("select count(*) from Employee emp");
		Object obj = query.getSingleResult();
		System.out.println(obj);

		tx.commit();
		entityManager.close();

	}

	public static void readName(EntityManagerFactory factory) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		Query query = entityManager.createQuery("select emp.name from Employee emp where salary >= :sal");
		query.setParameter("sal", 80000L);

		Object obj = query.getSingleResult();
		System.out.println(obj);

		/*
		 * List<String> list = query.getResultList(); for(String str : list){
		 * System.out.println(str); }
		 */

		tx.commit();
		entityManager.close();

	}

	public static void readNameAndSalary(EntityManagerFactory factory) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		Query query = entityManager.createQuery(
				"select new map(emp.name as Name,emp.desig as Desig) from Employee emp where salary >= :sal");
		query.setParameter("sal", 40000L);

		List<Map> list = query.getResultList();
		for (Map map : list) {
			System.out.println(map);
			// System.out.println(map.get("Name"));
		}

		/*
		 * Query query = entityManager.createQuery(
		 * "select emp.name,emp.desig from Employee emp where salary >= :sal");
		 * query.setParameter("sal", 40000L);
		 * 
		 * List<Object[]> list = query.getResultList(); for(Object[] arr :
		 * list){ System.out.println(arr[0]); System.out.println(arr[1]); }
		 */

		tx.commit();
		entityManager.close();

	}

	public static void readAll(EntityManagerFactory factory) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		//Query query = entityManager.createQuery("from Employee");
		// Query query = entityManager.createQuery("from Employee where salary >
		// 50000");
		// Query query = entityManager.createQuery("from Employee where name
		// like 'P%'");
		// Query query = entityManager.createQuery("from Employee where salary
		// <= 20000 and desig='PL'");
		// Query query = entityManager.createQuery("from Employee where salary
		// <= ? and desig = ?");
		// Query query = entityManager.createQuery("from Employee where desig =
		// :des and salary <= :sal");
		// query.setParameter("sal", 40000L);
		// query.setParameter("des", "PM");

		// query.setParameter(1, 40000L);
		// query.setParameter(2, "PM");

		//query.setFirstResult(5);
		//query.setMaxResults(10);
		
		Query query = entityManager.createNamedQuery("bySalary");
		query.setParameter("sal", 40000L);
		
		
		List<Employee> list = query.getResultList();
		for (Employee employee : list) {
			System.out.println(employee);
		}

		tx.commit();
		entityManager.close();

	}

	public static void init(EntityManagerFactory factory) {

		Company c1 = new Company("Synechron", 10000);
		Company c2 = new Company("Microsoft", 70000);

		Employee e1 = new Employee("Abhishek", 59000, "SE", "MS");
		Employee e2 = new Employee("Sumin", 79000, "PL", "MS");
		Employee e3 = new Employee("Rohit", 19000, "PL", "MS");
		Employee e4 = new Employee("Mohit", 40000, "PS", "SW");
		Employee e5 = new Employee("Anuj", 12000, "PS", "MS");
		Employee e6 = new Employee("Praveen", 9000, "SE", "SW");
		Employee e7 = new Employee("Shikhar", 11000, "PM", "MS");
		Employee e8 = new Employee("Kohli", 56000, "PM", "SW");
		Employee e9 = new Employee("Sachin", 20000, "PL", "MS");
		Employee e10 = new Employee("Jaggu", 39000, "SE", "SW");
		Employee e11 = new Employee("Pintu", 26000, "SE", "COE");
		Employee e12 = new Employee("Ganshu", 12000, "PM", "COE");
		Employee e13 = new Employee("Chintu", 18000, "SE", "COE");
		Employee e14 = new Employee("Kumar", 70000, "SE", "MS");
		Employee e15 = new Employee("Munni", 50000, "SE", "MS");
		Employee e16 = new Employee("Munna", 79000, "PL", "COE");
		Employee e17 = new Employee("Dawood", 8000, "SE", "COE");
		Employee e18 = new Employee("Laden", 23000, "SSE", "COE");
		Employee e19 = new Employee("Shakeel", 39000, "SSE", "MS");
		Employee e20 = new Employee("Obama", 89000, "PL", "COE");

		c1.getEmployees().add(e1);
		c1.getEmployees().add(e2);
		c1.getEmployees().add(e3);
		c1.getEmployees().add(e4);
		c1.getEmployees().add(e5);
		c1.getEmployees().add(e6);
		c1.getEmployees().add(e7);
		c1.getEmployees().add(e8);
		c1.getEmployees().add(e9);
		c1.getEmployees().add(e10);
		c1.getEmployees().add(e11);
		c1.getEmployees().add(e12);

		c2.getEmployees().add(e13);
		c2.getEmployees().add(e14);
		c2.getEmployees().add(e15);
		c2.getEmployees().add(e16);
		c2.getEmployees().add(e17);
		c2.getEmployees().add(e18);
		c2.getEmployees().add(e19);
		c2.getEmployees().add(e20);

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		entityManager.persist(c1);
		entityManager.persist(c2);

		tx.commit();
		entityManager.close();

	}

}
