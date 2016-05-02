package com.example.arm;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		new Main();
	}

	public Main() {
		demoTwo();
		demoOne();
		demoThree();
	}

	//Java 7
	private void demoThree() {
		try(
				FileReader reader = new FileReader(new File("C:/demos/hello.txt"));
		){
			char buffer[] = new char[50];
			reader.read(buffer);
			while (buffer.length > 0) {
				System.out.println(new String(buffer));
				reader.read(buffer);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}


	
	//Java 7
	private void demoTwo() {
		try(
				Connection connection = DriverManager.getConnection("jdbc:derby:synechrondb;create=true");
				PreparedStatement statement = connection.prepareStatement("select * from product_details");
				ResultSet resultSet = statement.executeQuery();
		){
		
			while (resultSet.next()) {
				System.out.printf("ID : %d and Name : %s%n", resultSet.getInt(1), resultSet.getString(2));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}


	//Before Java 7
	private void demoOne() {
		Connection connection = null;
		PreparedStatement statement  = null;
		ResultSet resultSet = null;
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			connection = DriverManager.getConnection("jdbc:derby:synechrondb;create=true");
			statement = connection.prepareStatement("select * from product_details");
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				System.out.printf("ID : %d and Name : %s%n", resultSet.getInt(1), resultSet.getString(2));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try{
				if(resultSet != null){
					resultSet.close();
					resultSet = null;
				}
				if(statement != null){
					statement.close();
					statement = null;
				}
				if(connection !=null){
					connection.close();
					connection = null;
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
