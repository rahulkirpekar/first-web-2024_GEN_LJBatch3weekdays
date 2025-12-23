package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EighthServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		Object obj = request.getAttribute("student");
//		StudentBean s = (StudentBean)obj;
		
		StudentBean s1 = (StudentBean)request.getAttribute("student1");
		StudentBean s2 = (StudentBean)request.getAttribute("student2");
		
		PrintWriter out = response.getWriter(); 
		
		out.println("<b>EighthServlet : </b><br>" + s1.getRno()+" " + s1.getName()+" " + s1.getStd());
		out.println("<br>" + s2.getRno()+" " + s2.getName()+" " + s2.getStd());
	}
}
