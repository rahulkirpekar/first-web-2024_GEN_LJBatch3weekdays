package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DiamondServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String []a = {"#ff4000","#ff8000","#80ff00","#00ffff","#ff00ff",
				  "#FF5733",
				  "#33FF57",
				  "#3357FF",
				  "#FF33A8",
				  "#A833FF",
				  "#33FFF6",
				  "#FFC300",
				  "#DAF7A6",
				  "#C70039",
				  "#900C3F",
				  "#581845","#1ABC9C","#2ECC71","#3498DB","#9B59B6","#34495E","#16A085","#27AE60","#2980B9","#8E44AD"};
			
		List<String> list = Arrays.asList(a);
		
		int temp  = 0; 
		
		// MIME 
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		for (int i = 1; i <=5; i++) 
		{
			for (int k = (5-i); k >=1; k--) 
			{
				out.print("&nbsp&nbsp");
			}
			for (int j = 1; j <=i; j++) 
			{
				out.print("<font color='"+ list.get(temp++) +"' >*&nbsp&nbsp</font>");
			}
			out.println("</br>");
		}
		for (int i = 4; i >=1; i--) 
		{
			for (int k = (5-i); k >=1; k--) 
			{
				out.print("&nbsp&nbsp");
			}
			for (int j = 1; j <=i; j++) 
			{
				out.print("<font color='"+ list.get(temp++) +"' >*&nbsp&nbsp</font>");
			}
			out.println("</br>");
		}
	}
}
