package com.example.annotation;

import org.springframework.stereotype.Component;

@Component
public class UniqueGenerator {

	public int generate(){
		return (int)(System.nanoTime()*Runtime.getRuntime().freeMemory());
	}
}
