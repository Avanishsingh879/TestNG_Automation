package com.genpact.stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase_Mysql {
	
	
	public static void main(String args[]) throws SQLException {
		
		Connection Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/campus", "root","Mathura@!0809");
		
		if(Connection.isClosed()) {
			
			System.out.println("Database is not connected");
		}
		
		else {
			
			System.out.println("Database connected with mysql");
		}
		 
	}

}
