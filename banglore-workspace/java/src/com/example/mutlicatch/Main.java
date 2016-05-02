package com.example.mutlicatch;

import java.io.File;
import java.io.FileNotFoundException;
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
		demoOne();
	}

	//Java 7
	private void demoOne() {
		try(
				FileReader reader = new FileReader(new File("C:/demos/hello.txt"));
				Connection connection = DriverManager.getConnection("jdbc:derby:synechrondb;create=true");
				PreparedStatement statement = connection.prepareStatement("select * from product_details");
				ResultSet resultSet = statement.executeQuery();
		){
		
			while (resultSet.next()) {
				System.out.printf("ID : %d and Name : %s%n", resultSet.getInt(1), resultSet.getString(2));
			}

			File file = new File("C:/demos/hello.txt");
			char buffer[] = new char[(int)file.length()];
			reader.read(buffer);
			System.out.println(new String(buffer));
			
			int i = 10/0;
			System.out.println(i);
			
		}catch (SQLException | IOException | ArithmeticException e) {
			e.printStackTrace();
			StackTraceElement elements[] = e.getStackTrace();
			for(StackTraceElement traceElement : elements){
				System.out.println(traceElement.getMethodName());
			}
		}

	}
	
}