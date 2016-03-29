package com.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args){
		
		/**Configuration cf = new Configuration();
		@SuppressWarnings("deprecation")
		SessionFactory sf = cf.configure().buildSessionFactory();
		Session session = sf.openSession();
		sf.close();
		**/
		
		Person p1 = new Person();
		p1.setUid(100);
		p1.setName("Sumin");
		p1.setAge(25);
		PersonDAO.save(p1);
		
	}
}













