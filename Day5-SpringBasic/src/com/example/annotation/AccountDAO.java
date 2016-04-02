package com.example.annotation;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void save(){
		System.out.println("AccountDAO.save()");
	}
	
	public void delete(){
		System.out.println("AccountDAO.delete()");
	}

}
