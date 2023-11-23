package com.genpact.stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DB_Testing {
	
	
	
	@Test
	public void testdb() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");// // Database connection
		System.out.println("Driver loaded");
		Connection Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/campus", "root","Mathura@!0809");
		System.out.println("Connect with MysqlDB");
		
		Statement smt=Connection.createStatement();
		
		ResultSet rs=smt.executeQuery("select * from campus.Item");
		
		while(rs.next()) {
			
			String firstname=rs.getNString("FirstName");
			System.out.println("Database Record is: " +firstname);
			
			
		}
		
		
	}

}
