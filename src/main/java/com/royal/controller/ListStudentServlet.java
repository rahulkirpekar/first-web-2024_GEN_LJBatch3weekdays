package com.royal.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListStudentServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("ListStudentServlet : service()");
		
		StudentDao dao = new StudentDao();
		
		ArrayList<StudentBean> list = dao.getAllStudentRecords();
		
		request.setAttribute("list", list);
		
		System.out.println("ListStudentServlet records count: " + list.size());
		
		request.getRequestDispatcher("studlist.jsp").forward(request, response);
	}
}