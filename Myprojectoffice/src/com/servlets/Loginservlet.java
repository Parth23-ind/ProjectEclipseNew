package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String fname= request.getParameter("firstname");
		String lname= request.getParameter("lastname");
		String email= request.getParameter("email");
		String mno= request.getParameter("mobilenumber");
		
		out.println("Your data has been stored successfully with us!!");
	}

}
