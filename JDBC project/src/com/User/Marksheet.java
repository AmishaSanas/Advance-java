package com.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Marksheet {
	
	public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "root");
	
	// Query to fetch top 5 students based on total marks

	PreparedStatement ps = conn.prepareStatement("SELECT *,(Phy + Chem + Maths) AS total,((Phy + Chem + Maths)/3) as percentage FROM marksheets ORDER BY total DESC");
	
	ResultSet rs = ps.executeQuery();
	
	
	 // Iterate through the result set and display the top 5 students
	System.out.println("ID RollNo Name Phy Chem Maths Total Percentage");
	
	while (rs.next()) {
		
			 int total = rs.getInt(4) + rs.getInt(5) + rs.getInt(6);
			 
			 double percentage = (rs.getInt(4) + rs.getInt(5) + rs.getInt(6))/3;
			 
			 if (rs.getInt(4)>=33 && rs.getInt(5)>=33 && rs.getInt(6)>=33) {
				 
				 System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getString(3) + " " + rs.getInt(4) +  " " + rs.getInt(5) +  " " + rs.getInt(6) + " " + total + " " + percentage + " " + " Pass"); 
				
			}else {
				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getString(3) + " " + rs.getInt(4) +  " " + rs.getInt(5) +  " " + rs.getInt(6) + " " + total + " " + percentage + " " + " Fail"); 
					
			}
				
			 
			}

 }

}