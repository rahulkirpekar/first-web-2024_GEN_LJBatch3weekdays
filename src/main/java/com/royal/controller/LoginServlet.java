package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	
	// htmlform(get)------servlet---doGet()---Works
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = 	response.getWriter();
		out.print("<b>LoginServlet ---Hi I am Get Request--Handled By doGet()</b><br>");
		
		Enumeration<String> e = request.getParameterNames();// userName,password
		
		while(e.hasMoreElements()) 
		{
			String paramName = e.nextElement();
			
			String paramValue = request.getParameter(paramName);
			
			out.print("<b>"+paramName+" </b>" + paramValue+"<br>");
		}
		
//		String userName = request.getParameter("userName");
//		String password = request.getParameter("password");
		
//		out.print("<b>password </b>" + password+"<br>");
		
	}
	
	// htmlform(post)-----servlet---doGet()---Works
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
	
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
//	{
//		PrintWriter out = 	response.getWriter();
//		out.print("<b>LoginServlet </b><br>");
//		
//		Enumeration<String> e = request.getParameterNames();// userName,password
//		
//		while(e.hasMoreElements()) 
//		{
//			String paramName = e.nextElement();
//			
//			String paramValue = request.getParameter(paramName);
//			
//			out.print("<b>"+paramName+" </b>" + paramValue+"<br>");
//		}
//		
////		String userName = request.getParameter("userName");
////		String password = request.getParameter("password");
//		
////		out.print("<b>password </b>" + password+"<br>");
//	}
}
