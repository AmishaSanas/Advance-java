package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {
	
	public static void main(String[] args) throws Exception {

		// Step 1 Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 Make Connection to the database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		// Step 3 Create Statement
		Statement stmt = conn.createStatement(); 

		//int i = stmt.executeUpdate("insert into employee values(11, 'Ram', 'Yadav', 'TCS', 65000, 'Ujjain', 2)");
		
		int up = stmt.executeUpdate("update employee set Company = 'delloite' where firstname = 'Anjali'" );
		
		int d = stmt.executeUpdate(" delete from employee where id = 3");
		
		//System.out.println("data inserted successfully: " + i);
		System.out.println("data update successfully: " + up);
		System.out.println("data delete successfully: " + d);
	}

}