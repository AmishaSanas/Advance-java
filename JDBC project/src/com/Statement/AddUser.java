package com.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddUser {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

		Statement s = conn.createStatement();

		int i = s.executeUpdate(
				"insert into user values(11, 'Karan', 'Mehra', 'karan@gmail.com', 'karan123', 'Indore,Madhyapradesh', '2001-02-02')");

		System.out.println("User added successfully.. " + i);
	}

}
