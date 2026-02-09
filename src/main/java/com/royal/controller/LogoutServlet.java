package com.royal.controller;

import java.io.IOException;

import com.royal.bean.UserBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// check session
		HttpSession session = request.getSession(false);
		
		RequestDispatcher rd = null;
		
		if (session == null) 
		{
			UserBean userBean = (UserBean)session.getAttribute("userBean");
			if(userBean==null) 
			{
				rd = request.getRequestDispatcher("login.jsp");
				request.setAttribute("loginAccess", "<font color='red'> Please First Login.</font");
			}else 
			{
				// Logout---session delete
				session.invalidate();
				
				request.setAttribute("logoutSuccess", "<font color='red'>Please First Login.</font");
				rd = request.getRequestDispatcher("login.jsp");
			}
		} else 
		{
			// Logout---session delete
			session.invalidate();
			
			request.setAttribute("logoutSuccess", "<font color='green'>Logout Successfully.</font");
			rd = request.getRequestDispatcher("login.jsp");
		}
		rd.forward(request, response);
	}
}
