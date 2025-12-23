package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SeventhServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Data
		StudentBean sbean1 = new StudentBean(1, "Krishna", 12);
		StudentBean sbean2 = new StudentBean(2, "Ganesh", 12);
		
		// store student object in request object
		request.setAttribute("student1", sbean1);
		request.setAttribute("student2", sbean2);
		
//		RequestDispatcher rd = request.getRequestDispatcher("EighthServlet");
//		rd.forward(request, response);
		
		request.getRequestDispatcher("EighthServlet").forward(request, response);
	}
}
