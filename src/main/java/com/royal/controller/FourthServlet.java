package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FourthServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
								// FourthServlet---FourthServletConfig
		ServletConfig config =	getServletConfig();// FourthServletConfig
		
		String urlName = config.getInitParameter("urlName");
		String driverClass = config.getInitParameter("driverClass");
		String userName = config.getInitParameter("userName");
		String password = config.getInitParameter("password");
		
		
		PrintWriter out  = response.getWriter();
		
		
		out.print("<b>Url Name</b> : " + urlName+"</br>");
		out.print("<b>DriverClass</b> : " + driverClass+"</br>");
		out.print("<b>UserName</b> : " + userName+"</br>");
		out.print("<b>Password</b> : " + password+"</br>");
		

		
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
