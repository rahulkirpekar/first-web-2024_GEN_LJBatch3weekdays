package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class TenthServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		StudentBean sbean1 = new StudentBean(1, "Krishna", 12);
		StudentBean sbean2 = new StudentBean(2, "Ganesh", 12);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("student1", sbean1);
		session.setAttribute("student2", sbean2);
		
		System.out.println("TenthServlet---service()----Student Objects(Data) stored into session.");
	}
}
