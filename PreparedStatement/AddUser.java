package com.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddUser {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		
		PreparedStatement ps = c.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
		
		int nextpk = UserNextPk.nextPk();

		System.out.println("next pk: " + nextpk);

		ps.setInt(1, nextpk);
		ps.setString(2, "Roshni");
		ps.setString(3, "Sharma");
		ps.setString(4, "roshni@gmail.com");
		ps.setString(5, "roshni123");
		ps.setString(6, "Pune");
		ps.setDate(7, new java.sql.Date(2003,02,04));
		
		
		int i = ps.executeUpdate();

		System.out.println("data added successfully: " + i);
		
	}
}
