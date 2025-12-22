package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
								// ThirdServlet---ThirdServletConfig
		ServletConfig config =	getServletConfig();// ThirdServletConfig
		
//		String urlName = config.getInitParameter("urlName");
//		String driverClass = config.getInitParameter("driverClass");
//		String userName = config.getInitParameter("userName");
//		String password = config.getInitParameter("password");
		
		PrintWriter out  = response.getWriter();
		
		out.print("<b>ThirdServlet : service()</b>");
		out.print("<b>ThirdServletConfig : </b> : " + config);
		
		
		Enumeration<String> paramNames = config.getInitParameterNames();
		
		while(paramNames.hasMoreElements()) 
		{
			String paramName = paramNames.nextElement();
			
			String paramValue = config.getInitParameter(paramName);
			
			out.print("<b>"+paramName+"</b> : " + paramValue+"</br>");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		doGet(req, resp);
	}
}
