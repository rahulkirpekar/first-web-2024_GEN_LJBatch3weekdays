package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EighteenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String value = (String)request.getAttribute("test1");
		
		System.out.println("EighteenServlet :  value --"+value);
		
		request.setAttribute("test1", "Ganesh");
		
		System.out.println("-----------------------------------");
		
		request.removeAttribute("test1");
	}
}
