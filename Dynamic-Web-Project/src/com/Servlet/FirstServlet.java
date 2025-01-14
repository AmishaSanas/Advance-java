package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//mapping of Servlet by @WebServlet annotaion
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("In get method");

		response.sendRedirect("FirstView.jsp");

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("In post method");
		
		PrintWriter out = response.getWriter();
		out.write("in post method \n");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");

		out.write(firstName + "\n");
		out.write(lastName + "\n");
		out.write(loginId + "\n");
		out.write(password + "\n");
		out.write(dob + "\n");
		out.write(address + "\n");
		
		
	}

}
