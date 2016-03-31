package com.example.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	
	public static void main(String[] args) {
				
		Configuration cfg = new Configuration();
		//Hibernate is started
		SessionFactory sf =  cfg.configure("com/example/dao/hibernate.cfg.xml").buildSessionFactory();
	
			PersonDAO.save(sf);
				
		//Hibernate is stopped
		sf.close();
	}
	
}
