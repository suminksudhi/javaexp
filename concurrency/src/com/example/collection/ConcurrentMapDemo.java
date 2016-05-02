package com.example.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapDemo {

	public static void main(String[] args) {
		new ConcurrentMapDemo();
	}
	
	public ConcurrentMapDemo() {
		demoThree();
		demoOne();
		//demoTwo();
	}
	
	private void demoThree(){
			
			ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
			concurrentMap.putIfAbsent("Raj", 120);
			System.out.println(concurrentMap);
			
	}
	
	private void demoTwo(){
		
		Map<String, Integer> map = new HashMap<>();
		
		//Thread 1
		map.put("Hello", 100);
		map.put("Hi", 200);
		map.put("Bye", 300);
		
		//Thread 2
		Iterator<String> iterator = map.keySet().iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
		
		//Thread 1
		map.remove("Bye");
		
		
		//Thread 2
		System.out.println(iterator.next());
		
		
	
	}
	
	private void demoOne(){
		
		ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
		
		//Thread 1
		concurrentMap.put("Hello", 100);
		concurrentMap.put("Hi", 200);
		concurrentMap.put("Bye", 300);
		
		//Thread 2
		Iterator<String> iterator = concurrentMap.keySet().iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
		
		//Thread 1
		concurrentMap.remove("Bye");
		
		
		//Thread 2
		System.out.println(iterator.next());
	}
}
