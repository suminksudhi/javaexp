package com.example.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

	@PostConstruct
	public void init(){
		System.out.println("Inside HelloWorld.init()");
	}

	@PreDestroy
	public void clean(){
		System.out.println("Inside HelloWorld.clean()");
	}

	public void sayHello(){
		System.out.println("Hello Spring....");
	}
	
}
