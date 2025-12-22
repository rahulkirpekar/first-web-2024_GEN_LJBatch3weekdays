package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SixthServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext context	= getServletContext();
		
		Enumeration<String> paraList =	context.getInitParameterNames();
		
		PrintWriter out = response.getWriter(); 
		
		while (paraList.hasMoreElements()) 
		{
			String paramName = (String) paraList.nextElement();
			
			String paramValue =	context.getInitParameter(paramName);
			
			out.print("<b>"+paramName+"</b>----"+paramValue+"<br>");
		}
	}
}
