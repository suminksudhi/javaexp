package com.example.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeDemo {

	public static void main(String[] args) {
		new InvokeDemo();
	}
	
	public InvokeDemo() {
		demoOne();
	}
	
	private void demoOne(){
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		List<Callable<String>> tasks = new ArrayList<>();
		tasks.add(()->{ 
			System.out.println("Email task is called!"); 
			return "Email Sent";
		});
		
		tasks.add(()->{ 
			System.out.println("SMS task is called!"); 
			return "SMS Sent";
		});
		
		tasks.add(()->{ 
			System.out.println("Letter task is called!"); 
			return "Letter Sent";
		});
		
		tasks.add(()->{ 
			System.out.println("Missed Call task is called!"); 
			return "Missed Call Sent";
		});
		
		
		try {
			List<Future<String>>  futures = executorService.invokeAll(tasks);
			futures.forEach((future)->{
				try {
					System.out.println("I am here.......");
					System.out.printf("Result : %s%n",future.get());
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			});
		} catch (InterruptedException  e) {
			e.printStackTrace();
		}
		
	}
}
