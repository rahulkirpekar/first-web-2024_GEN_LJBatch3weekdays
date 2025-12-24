package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NinethServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		StudentBean s1 = (StudentBean)request.getAttribute("student1");
		StudentBean s2 = (StudentBean)request.getAttribute("student2");

		System.out.println("------------------------------------------------");
		System.out.println("NinethServlet s1 : " + s1.getRno()+" " + s1.getName()+" " + s1.getStd());
		System.out.println("NinethServlet s2: " + s2.getRno()+" " + s2.getName()+" " + s2.getStd());
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("------------------------------------------------");
		
		//PrintWriter out = response.getWriter(); 
		
//		System.out.println("<br>" + s2.getRno()+" " + s2.getName()+" " + s2.getStd());
		
		
	}
}
