package com.genpact.stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Testing2 {
	
	
	
	//Connection with Database Date//3-12-2023
	//Database connection with Selenium Date 17-12-2023
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class Loaded");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/campus", "root", "Mathura@!0809");
		
		System.out.println("Connect with MySql");
		
		Statement smt=connection.createStatement();
		ResultSet rs=smt.executeQuery("Select * from campus.Item");
		
		while(rs.next()) {
			
			String Firstname=rs.getString("FirstName");
			
			System.out.println("Total First Name Records " +Firstname );
		}
		
		
	}
}
