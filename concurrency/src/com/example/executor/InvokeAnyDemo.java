package com.example.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class InvokeAnyDemo {

	public static void main(String[] args) {
		new InvokeAnyDemo();
	}
	
	public InvokeAnyDemo() {
		demoOne();
	}
	
	private void demoOne(){
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		List<Callable<String>> tasks = new ArrayList<>();
		tasks.add(()->{ 
			System.out.println("Email task is called!"); 
			TimeUnit.SECONDS.sleep(5);
			return "Email Sent";
		});
		
		tasks.add(()->{ 
			System.out.println("SMS task is called!"); 
			TimeUnit.SECONDS.sleep(3);
			return "SMS Sent";
		});
		
		tasks.add(()->{ 
			System.out.println("Letter task is called!"); 
			TimeUnit.SECONDS.sleep(4);
			return "Letter Sent";
		});
		
		tasks.add(()->{ 
			System.out.println("Missed Call task is called!"); 
			TimeUnit.SECONDS.sleep(2);
			return "Missed Call Sent";
		});
		
		
		try {
			String result = executorService.invokeAny(tasks);
			System.out.printf("Result : %s%n",result);
		} catch (InterruptedException | ExecutionException  e) {
			e.printStackTrace();
		}
		
	}
}
