package com.example.annotation;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO {
	
	public void save(){
		System.out.println("Inside AccountDAO.save()");
	}

	public void read(){
		System.out.println("Inside AccountDAO.read()");
	}
	
}
