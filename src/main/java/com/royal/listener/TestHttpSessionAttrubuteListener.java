package com.royal.listener;

import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

public class TestHttpSessionAttrubuteListener implements HttpSessionAttributeListener 
{
	@Override
	public void attributeAdded(HttpSessionBindingEvent se) 
	{
		System.out.println("TestHttpSessionAttrubuteListener : attributeAdded()");
	}
	
	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) 
	{
		System.out.println("TestHttpSessionAttrubuteListener : attributeReplaced()");
		
	}
	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) 
	{
		System.out.println("TestHttpSessionAttrubuteListener : attributeRemoved()");
	}
}
