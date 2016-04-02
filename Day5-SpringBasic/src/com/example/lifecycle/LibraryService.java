package com.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//adding lifecycle support using InitializingBean
public class LibraryService {
	
	/**
	 * sun provide some common annotation supported by many frameworks for life cycle managemenet
	 * making it resusable in nature
	 */
	@PostConstruct
	public void init(){
		System.out.println("library init");
	}
	
	@PreDestroy
	public void clean(){
		System.out.println("library delete");
	}
	
	
	public void listBooks(){
		System.out.println("book listed successfully");
	}
	
	public void listNext(){
		System.out.println("next successfully");
	}

}
