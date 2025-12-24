package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class TwelveServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(false);
		
		StudentBean s1= (StudentBean)session.getAttribute("student1");
		StudentBean s2= (StudentBean)session.getAttribute("student2");
		
		System.out.println("TwelveServlet : ");
		System.out.println("------------------------");
		System.out.println(s1+"---"+s1.getRno()+" " + s1.getName()+" " + s1.getStd());
		System.out.println(s2+"---"+s2.getRno()+" " + s2.getName()+" " + s2.getStd());	}

}
