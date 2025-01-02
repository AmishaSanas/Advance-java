package com.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteUser {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

		Statement s = conn.createStatement();

		int i = s.executeUpdate("delete from user where id = 11");

		System.out.println("User Deleted successfully.. " + i);
	}

}
