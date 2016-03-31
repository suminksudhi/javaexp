package com.example.hql;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		//JPA started
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql-unit");
		
		//QBCDAO.readBySalary(factory);
		//QBCDAO.readAll(factory);
		//AllDAO.readNatively(factory);
		//AllDAO.readByCompany(factory);
		//AllDAO.deptBy(factory);
		//AllDAO.countAll(factory);
		//AllDAO.readName(factory);
		//AllDAO.readNameAndSalary(factory);
		//AllDAO.readAll(factory);
		//AllDAO.init(factory);
		
		
		//JPA stopped
		factory.close();
		
	}
}
