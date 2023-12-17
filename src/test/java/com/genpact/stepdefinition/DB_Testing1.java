package com.genpact.stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Testing1 {
	//Selenium connect to Mysql database Date 17-12-23
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		

		Class.forName("com.mysql.jdbc.Driver");// // Database connection
		System.out.println("Driver loaded");
		Connection Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/campus", "root","Mathura@!0809");
		System.out.println("Connect with MysqlDB");
		
		Statement smt=Connection.createStatement();
		
		ResultSet rs=smt.executeQuery("select * from campus.Item");
		
		
		//int result=smt.executeUpdate("update Item set FirstName='Anil' where EmpID=1");
		
		//System.out.println("Number are recored is updated" +result);
		
		
		while(rs.next()) {
			
			String firstname=rs.getString("FirstName");
			System.out.println("Database Record is: " +firstname);
			
			
		}
		//Connection.close();
	}

}
