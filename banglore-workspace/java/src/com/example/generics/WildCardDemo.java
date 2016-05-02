package com.example.generics;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

public class WildCardDemo {
	
	public static void main(String[] args) {
		
		Integer i = new Integer(10000);
		System.out.println(i);
		
		Object object = i;
		System.out.println(object);
		
		//List<?> objects = null;
		List<?> objects = null;
					
		List<String> strings = new ArrayList<>();
		strings.add("Merc");
		strings.add("Royals");
		System.out.println(strings);	
	
		List<Integer> integers = new ArrayList<>();
		integers.add(890000000);
		integers.add(200000000);
		System.out.println(integers);
		
		objects = strings;
		objects = integers;
		objects.add(null);
			
	}

}
