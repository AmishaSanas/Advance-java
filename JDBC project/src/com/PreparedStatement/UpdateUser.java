package com.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateUser {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

		PreparedStatement ps = conn.prepareStatement(
				"update user set firstName = ?, lastName = ?, loginId = ?, password = ?, address = ?, dob = ? where id = ?");

		ps.setString(1, "Roshan");
		ps.setString(2, "Sharma");
		ps.setString(3, "roshan@gmail.com");
		ps.setString(4, "roshan123");
		ps.setString(5, "Pune");
		ps.setDate(6, new java.sql.Date(2003, 11, 02));
		ps.setInt(7, 15);

		int i = ps.executeUpdate();

		if (i == 0) {

			System.out.println("Record not found !! ");

		} else {

			System.out.println("Data updated successfully: " + i);

		}
	}

}