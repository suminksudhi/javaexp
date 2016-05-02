package com.example.javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection connection = DriverManager.getConnection("jdbc:derby:synechrondb;create=true");
		//generateTable(connection);
		saveData(connection);
		readData(connection);
		connection.close();
	}
	
	private static void generateTable(Connection connection) throws Exception{
		PreparedStatement statement= connection.prepareStatement("create table product_details(pid int,name varchar(20))");
		statement.executeUpdate();
		statement.close();
	
	}

	private static void saveData(Connection connection) throws Exception{
		PreparedStatement statement1= connection.prepareStatement("insert into product_details values (100,'Pen')");
		statement1.executeUpdate();
		statement1.close();
		PreparedStatement statement2= connection.prepareStatement("insert into product_details values (200,'Mobile')");
		statement2.executeUpdate();
		statement2.close();
	}


	private static void readData(Connection connection) throws Exception{
		PreparedStatement statement = connection.prepareStatement("select * from product_details");
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()){
			System.out.printf("ID : %d and Name : %s%n",resultSet.getInt(1),resultSet.getString(2));
		}
		resultSet.close();
		statement.close();
	}
}