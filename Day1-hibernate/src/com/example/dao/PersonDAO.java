package com.example.dao;

import org.dom4j.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonDAO{
	
	public static void save(Person person){
		Configuration cf = new Configuration();
		@SuppressWarnings("deprecation")
		SessionFactory sf = cf.configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
			session.save(person);
		tx.commit();
		session.close();
		sf.close();
	}
	
}