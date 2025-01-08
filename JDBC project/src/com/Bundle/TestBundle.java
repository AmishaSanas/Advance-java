package com.Bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestBundle {
	
	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.bundle.app", new Locale("sp"));
		
		System.out.println(rb.getString("greeting"));
		
		
	
		}
	
}
