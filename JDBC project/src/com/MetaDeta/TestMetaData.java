package com.MetaDeta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class TestMetaData {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
		
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("select * from marksheets");

		ResultSetMetaData md = rs.getMetaData();

		//System.out.println(metaData);

		/*
		 * System.out.println("Catalog Name: " + md.getCatalogName(1));
		 * 
		 * System.out.println("Table Name: " + md.getTableName(1));
		 * 
		 * System.out.println("Column Count: " + md.getColumnCount());
		 */
		int m = md.getColumnCount();
		
		for (int i = 1; i <= m ; i++) {
			
		System.out.println("colum name: " + md.getColumnName(i));
		System.out.println("Size: " + md.getColumnDisplaySize(i));	
		System.out.println("Precision: " + md.getPrecision(i));
		System.out.println("Label: " + md.getColumnLabel(i));
			
		}
		
		
	}

}
