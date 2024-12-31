package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnection {
	
	public static void main(String[] args) throws Exception {
		
		// Step 1 Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Step 2 Make Connection to the database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root", "root");
		
		// Step 3 Create Statement
		Statement s = con.createStatement();
		
		// Step 4 ExecuteQuery and get ResultSet
		ResultSet rs = s.executeQuery("select * from department");
		
		System.out.println("Database Connection Successfully......");

	
		while (rs.next()) {
			
			System.out.print(rs.getInt(1));
			System.out.println("\t" + rs.getString(2));
			
		}
		
	}

}
