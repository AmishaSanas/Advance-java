package com.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateUser {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

		Statement s = conn.createStatement();

		int i = s.executeUpdate(
				"update user set firstName = 'Raman', lastName = 'Yadav', loginId = 'raman@gmail.com', Password = 'raman123', address = 'Bhopal,MadhyaPradesh', dob = '2003-02-02' where id = 2");

		System.out.println("User updated successfully.. " + i);
	}

}
