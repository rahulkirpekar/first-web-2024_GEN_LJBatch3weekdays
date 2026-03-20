package com.royal.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.royal.bean.StudentBean;
import com.royal.bean.UserBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ListStudentServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("ListStudentServlet : service()");
		
		HttpSession session =  	request.getSession(false);
		
		if(session != null) 
		{
			UserBean userBean = (UserBean)session.getAttribute("userBean");
			if(userBean!=null) 
			{
				StudentDao dao = new StudentDao();
				
				ArrayList<StudentBean> list = dao.getAllStudentRecords();
				
				request.setAttribute("list", list);
				
				System.out.println("ListStudentServlet records count: " + list.size());
				
				request.getRequestDispatcher("studlist.jsp").forward(request, response);
			
			}else 
			{
				request.setAttribute("loginAccess", "<font color='red'>Invalid Access, Please Enter login first.</font");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}else 
		{
			request.setAttribute("loginAccess", "<font color='red'>Invalid Access, Please Enter login first.</font");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}



