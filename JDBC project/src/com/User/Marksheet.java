package com.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Marksheet {
	
	public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "root");

	PreparedStatement ps = conn.prepareStatement("select * from marksheets");
	
	ResultSet rs = ps.executeQuery();

	while (rs.next()) {
		
		int total =  rs.getInt(4) + rs.getInt(5) + rs.getInt(6);
		
		double percentage =  (rs.getInt(4) + rs.getInt(5) + rs.getInt(6))/3;
		
		

		System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getString(3) + " " + rs.getInt(4) +  " " + rs.getInt(5) +  " " + rs.getInt(6) + total + " " + percentage);

	}

 }

}