package com.example.webservice;

import javax.xml.ws.Endpoint;

public class Main {
	
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:4000/synechron/services/account", new AccountService());		
		System.out.println("Server is running.....");
	}

}
