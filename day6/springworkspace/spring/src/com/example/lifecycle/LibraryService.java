package com.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LibraryService {

	@PostConstruct
	public void init(){
		System.out.println("Inside LibraryService.init()");
	}

	@PreDestroy
	public void clean(){
		System.out.println("Inside LibraryService.clean()");
	}

	public void listBooks(){
		System.out.println("Number of books are around 135!");
	}


	public void issueBook(){
		System.out.println("Book has been issued to member!");
	}

	
}
