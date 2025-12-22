package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
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
		
//		String urlName = config.getInitParameter("urlName");
//		String driverClass = config.getInitParameter("driverClass");
//		String userName = config.getInitParameter("userName");
//		String password = config.getInitParameter("password");
		
		
//		PrintWriter out  = response.getWriter();
		
//		out.print("<b>Url Name</b> : " + urlName+"</br>");
//		out.print("<b>DriverClass</b> : " + driverClass+"</br>");
//		out.print("<b>UserName</b> : " + userName+"</br>");
//		out.print("<b>Password</b> : " + password+"</br>");
		
//		
//		PrintWriter out  = response.getWriter();
//		
//		out.print("<b>FourthServlet : service()</b>");
//		out.print("<b>FourthServletConfig : </b> : " + config);
//		
//		
//		Enumeration<String> paramNames = config.getInitParameterNames();
//		
//		while(paramNames.hasMoreElements()) 
//		{
//			String paramName = paramNames.nextElement();
//			
//			String paramValue = config.getInitParameter(paramName);
//			
//			out.print("<b>"+paramName+"</b> : " + paramValue+"</br>");
//		}
		
		
		ServletContext context =	getServletContext();
		
		String lang1 = context.getInitParameter("lang1");
		String lang2 = context.getInitParameter("lang2");
		String lang3 = context.getInitParameter("lang3");
		String lang4 = context.getInitParameter("lang4");
		String lang5 = context.getInitParameter("lang5");
		
		
		PrintWriter out  = response.getWriter();
		
		out.print("<b>FourthServlet : </b> "+"<br>");
		out.print("<b>lang1 : </b> " + lang1+"<br>");
		out.print("<b>lang1 : </b> " + lang2+"<br>");
		out.print("<b>lang1 : </b> " + lang3+"<br>");
		out.print("<b>lang1 : </b> " + lang4+"<br>");
		out.print("<b>lang1 : </b> " + lang5+"<br>");
		
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
