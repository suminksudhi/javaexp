package com.example.beanprocessor;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
@Author(name="Ritesh Tyagi")
public class LibraryService {

	@PostConstruct
	public void init(){
		System.out.println("Inside LibraryService.init()");
	}

	@Test
	public void listBooks(){
		System.out.println("Number of books are around 135!");
	}


	@Author(name="Ram Singh")
	public void issueBook(){
		System.out.println("Book has been issued to member!");
	}
	
}
