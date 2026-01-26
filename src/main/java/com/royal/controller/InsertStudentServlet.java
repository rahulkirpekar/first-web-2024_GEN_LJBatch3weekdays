package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;
import com.royal.util.StringUtils;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertStudentServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("=====InsertStudentServlet---doGet()=====");
		// Backend Validation
		
		boolean flag = false;
		
		StudentBean sbean = new StudentBean();
		
		String   fullname     = request.getParameter("fullname");
		
		if(StringUtils.isValidString(fullname)) 
		{
			sbean.setFullname(fullname);
		}else 
		{
			flag = true;
			request.setAttribute("fullnameErr","<font color='red'>Please enter valid FullName.</font>");
		}
		
		String age = request.getParameter("age");
		
		if(StringUtils.isValidString(age)) 
		{
			sbean.setAge(Integer.parseInt(age));
		}else 
		{
			flag = true;
			request.setAttribute("ageErr","<font color='red'>Please enter valid Age.</font>");
		}

		String   course       = request.getParameter("course");
		
		if(StringUtils.isValidString(course)) 
		{
			sbean.setCourse(course);
		}else 
		{
			flag = true;
			request.setAttribute("courseErr","<font color='red'>Please enter valid Course.</font>");
		}
		
		String   gender       = request.getParameter("gender");
		
		if(StringUtils.isValidString(gender)) 
		{
			sbean.setGender(gender);
		}else 
		{
			flag = true;
			request.setAttribute("genderErr","<font color='red'>Please enter valid Gender.</font>");
		}
		
		String   hobby[]      = request.getParameterValues("hobby");
		
		if(hobby != null) 
		{
			sbean.setHobby(hobby);
		}else 
		{
			flag = true;
			request.setAttribute("hobbyErr","<font color='red'>Please enter valid hobby.</font>");
		}
		
		String   dob          = request.getParameter("dob");
		
		if(StringUtils.isValidString(dob)) 
		{
			sbean.setDob(dob);
		}else 
		{
			flag = true;
			request.setAttribute("dobErr","<font color='red'>Please enter valid DOB.</font>");
		}
		
		String   email        = request.getParameter("email");
		
		if(StringUtils.isValidString(email)) 
		{
			if(new StudentDao().isUserEmailUnique(email)) 
			{
				sbean.setEmail(email);
			}else 
			{
				flag = true;
				request.setAttribute("emailErr","<font color='red'>Please enter Unique Email.</font>");
			}
		}else 
		{
			flag = true;
			request.setAttribute("emailErr","<font color='red'>Please enter valid Email.</font>");
		}
		
		String   mobile       = request.getParameter("mobile");
	
		if(StringUtils.isValidString(mobile)) 
		{
			sbean.setMobile(mobile);
		}else 
		{
			flag = true;
			request.setAttribute("mobileErr","<font color='red'>Please enter valid Mobile.</font>");
		}
		
		String   address      = request.getParameter("address");
		
		if(StringUtils.isValidString(address)) 
		{
			sbean.setAddress(address);
		}else 
		{
			flag = true;
			request.setAttribute("addressErr","<font color='red'>Please enter valid Address.</font>");
		}
		
		System.out.println("--------------------------------------------------");		
		System.out.println("fullname : "+fullname);
		System.out.println("age      : "+age     );
		System.out.println("course   : "+course  );
		System.out.println("gender   : "+gender  );
		System.out.println("hobby    : "+hobby   );
		System.out.println("dob      : "+dob     );
		System.out.println("email    : "+email   );
		System.out.println("mobile   : "+mobile  );
		System.out.println("address  : "+address );
		System.out.println("--------------------------------------------------");
		
		RequestDispatcher rd = null;

		request.setAttribute("sbean", sbean);
		
		if(flag) 
		{
			rd = request.getRequestDispatcher("studentregi.jsp");
		}else 
		{
			StudentDao dao = new StudentDao();
			
			int rowsAffected = dao.insertStudent(sbean);
			
			if(rowsAffected > 0) 
			{
				rd = request.getRequestDispatcher("ListStudentServlet");			
				
			}else 
			{
				request.setAttribute("dbError", "<font color='red'> Database Serverdown.</font>");
				rd = request.getRequestDispatcher("studentregi.jsp");			
			}
		}
		rd.forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
