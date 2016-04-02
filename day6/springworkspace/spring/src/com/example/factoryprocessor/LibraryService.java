package com.example.factoryprocessor;

import org.springframework.stereotype.Service;

@Service
public class LibraryService {

	public void listBooks(){
		System.out.println("Number of books are around 135!");
	}


	public void issueBook(){
		System.out.println("Book has been issued to member!");
	}
	
}
