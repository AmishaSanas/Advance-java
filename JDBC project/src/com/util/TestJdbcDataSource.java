package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJdbcDataSource {
	
	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 50; i++) {
			System.out.println("connection = " + i);
			
			testSearch();

		}
	}

	private static void testSearch() throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("select * from user where firstname like 'a%'");

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

		}

	}

}