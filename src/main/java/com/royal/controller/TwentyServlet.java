package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class TwentyServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("=====TwentyServlet : service()====");
//		HttpSession session = request.getSession();
//		session.setAttribute("userName", "Rahul Kirpekar");
//		System.out.println("TwentyServlet : service()");
		
//		ServletContext context = getServletContext();
		
//		context.setAttribute("test1", "Royal technosoft");
	}
}
