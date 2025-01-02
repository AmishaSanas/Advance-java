package com.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchUser {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

		//PreparedStatement ps = conn.prepareStatement("select * from user limit 0,5");
		
		//PreparedStatement ps  = conn.prepareStatement("select * from user where firstName like 'a%'");
		
		PreparedStatement ps = conn.prepareStatement("select * from user");
	
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			System.out.print(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + "\n");

		}

	}

}
