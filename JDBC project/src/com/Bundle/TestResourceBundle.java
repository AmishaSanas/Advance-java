package com.Bundle;

import java.util.ResourceBundle;

public class TestResourceBundle {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.Bundle.app");
		
		String url = rb.getString("url");
		
		String driver = rb.getString("driver");
		
		System.out.println(" url " + url);
		System.out.println("Driver " + driver);

	}

}
