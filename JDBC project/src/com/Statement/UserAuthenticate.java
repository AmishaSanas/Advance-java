package com.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserAuthenticate {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

		Statement s = conn.createStatement();

		ResultSet rs = s.executeQuery("select * from user where loginId = 'kabir@gmail.com' and password = 'kabir@123'");

		boolean b = false;

		while (rs.next()) {

			b = true;

			System.out.println(rs.getString(2) + " " + rs.getString(3));

		}

		if (!b) {
			System.out.println("invalid loginId or Password");
		}
	}

}
