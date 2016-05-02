package com.example.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import com.example.semaphore.ConnectionPool.Connection;

public class PoolDemo {
	
	public static void main(String[] args) {
		new PoolDemo();
	}
	
	public PoolDemo() {
		
		Semaphore semaphore = new Semaphore(10);
		
		DatabaseTask databaseTask = new DatabaseTask(semaphore);
		
		for(int i=0;i<50;i++){
			new Thread(databaseTask).start();
		}
		
	}

}

class DatabaseTask implements Runnable{
	
	Semaphore semaphore = null;
	
	public DatabaseTask(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	public void run() {
		
		try {
			semaphore.acquire();
				Connection connection = ConnectionPool.getConnection();
				System.out.println("Database connection obtained....");
				
					System.out.println("Database operation is going on....");
					System.out.println("Database operation is done....");
					//20 JDBC loc
				ConnectionPool.closeConnection(connection);
				System.out.println("Database connection released....");
				TimeUnit.SECONDS.sleep(5);
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
}

class ConnectionPool{
	
	public static Connection getConnection(){
		System.out.println("Connection Ready!");
		return new Connection();
	}
	
	
	public static void closeConnection(Connection connection){
		System.out.println("Connection closed!");
	}
	
	static class Connection{
		
	}
}
