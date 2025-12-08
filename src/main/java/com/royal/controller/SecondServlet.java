package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet
{
	@Override
	public void init() throws ServletException 
	{
		System.out.println("SecondServlet---init()--- SecondServlet Object created : " + this);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("=============================================================");
		System.out.println("SecondServlet---service()--- SecondServlet Object : " + this);
		System.out.println("request : " + request);
		
		System.out.println("request.getRemoteHost() : " + request.getRemoteHost());
		System.out.println("request.getRemoteAddr() : " + request.getRemoteAddr());
		System.out.println("request.getRemotePort() : " + request.getRemotePort());
		System.out.println("request.getRemoteUser() : " + request.getRemoteUser());
		
		
		System.out.println("response : " + response);
		System.out.println("=============================================================");
	}
	
	@Override
	public void destroy() 
	{
		System.out.println("SecondServlet---destroy()---SecondServlet Object : " + this);
	}
}
