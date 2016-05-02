package com.example.webservice;

import javax.jws.WebService;

@WebService
public class AccountService{

	public void bankDetails(String	 details) {
		System.out.println(details);
	}

	
	public boolean openAccount() {
		return true;
	}

	
}
