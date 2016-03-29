package com.example.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PersonDAO{

	public static void save(SessionFactory sf){

		Person p1 = new Person();
		p1.setUid(103);
		p1.setName("Raj");
		p1.setAge(34);

		Session session = sf.openSession();
		Transaction tx= session.beginTransaction();
		
			session.save(p1); 	

		tx.commit();
		session.close();
	}

} 