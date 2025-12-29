package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirteenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		StudentBean s1 = new StudentBean(1, "Sagar", 12);
		StudentBean s2 = new StudentBean(2, "Ramesh", 10);
		StudentBean s3 = new StudentBean(3, "Ankur", 11);
		
		// application scope---data -- Application--get Data from All  Servlelt + Jsp

		ServletContext context = getServletContext();
		
		context.setAttribute("student1", s1);
		context.setAttribute("student2", s2);
		context.setAttribute("student3", s3);
		
		System.out.println("ThirteenServlet---service---s1,s2,s3---store into applciation");
	}
}
