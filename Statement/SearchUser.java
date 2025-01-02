package com.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchUser {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

		Statement s = conn.createStatement();

		// search all recored
		// ResultSet rs = s.executeQuery("select * from user");

		// search by firstName
		// ResultSet rs = s.executeQuery("select * from user where firstName like 'a%'");

		// findeBy id
		//ResultSet rs = s.executeQuery("select * from user where id = 3");
		
		//find Subset
		//ResultSet rs = s.executeQuery("select * from user limit 0,4");
		
		ResultSet rs = s.executeQuery("select * from user where firstName like '_a%'");
		
		
		while (rs.next()) {
			System.out.println(rs.getString(2) + " " + rs.getString(3));

		}
  }
}