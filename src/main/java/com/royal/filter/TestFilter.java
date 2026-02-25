package com.royal.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class TestFilter implements Filter 
{
	public void init(FilterConfig fConfig) throws ServletException 
	{
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		//Pre-Filtering Code
		System.out.println("======TestFilter : doFilter() --- Pre-Filtering Code======");
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		//Post-Filtering Code
		System.out.println("======TestFilter : doFilter() --- Post-Filtering Code======");
	}
	public void destroy() 
	{
	}
}