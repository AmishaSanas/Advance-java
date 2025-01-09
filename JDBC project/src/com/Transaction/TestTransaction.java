package com.Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransaction {
	
	public static void main(String[] args) throws Exception{
		
		Connection con = null;
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
				
				// step 1
				con.setAutoCommit(false);
				
				Statement st = con.createStatement();
				
				int i = st.executeUpdate("insert into marksheets values(12, 112, 'Ram Sharma', 52, 65, 45)");
				
				i = st.executeUpdate("insert into marksheets values ( 13, 113,'Ritik Joshi', 82, 68, 71)");
				
				System.out.println("data inserted successfully: " + (i + i));
				
				// Step 2
				con.commit();
				
			} catch (SQLException e) {
				//Step 3
			 con.rollback();
			 e.printStackTrace();
			}
				
	}
	
}