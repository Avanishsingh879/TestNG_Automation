package com.genpact.stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Testing2 {
	
	
	
	//Connection with Database
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");//Driver class
		
		Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/campus", "root", "Mathura@!0809");
		
		Statement smt=Con.createStatement();
		
		ResultSet rs=smt.executeQuery("select * from campus.Item");
		
		while(rs.next()) {
			
			String firstname=rs.getString("FirstName");
			System.out.println("Database Record:" +firstname);
		}
		
		
	}

}
