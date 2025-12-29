package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FifteenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext context = getServletContext();
		
		StudentBean s1= (StudentBean)context.getAttribute("student1");
		StudentBean s2= (StudentBean)context.getAttribute("student2");
		StudentBean s3= (StudentBean)context.getAttribute("student3");

		System.out.println("FifteenServlet : ");
		System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
		System.out.println(s2.getRno()+" " + s2.getName()+" " + s2.getStd());
		System.out.println(s3.getRno()+" " + s3.getName()+" " + s3.getStd());
	}
}
