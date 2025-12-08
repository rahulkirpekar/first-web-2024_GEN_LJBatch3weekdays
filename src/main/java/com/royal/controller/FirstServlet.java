package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
{
	@Override
	public void init() throws ServletException 
	{
		System.out.println("FirstServlet---init()--- FirstServlet Object created : " + this);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("=============================================================");
		System.out.println("FirstServlet---service()--- FirstServlet Object : " + this);
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
		System.out.println("FirstServlet---destroy()---FirstServlet Object : " + this);
	}
}
