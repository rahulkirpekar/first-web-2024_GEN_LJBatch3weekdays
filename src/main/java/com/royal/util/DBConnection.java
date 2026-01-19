package com.royal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	private static final String URLNAME = "jdbc:mysql://localhost:3306/genlj24";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";	

	private static Connection conn = null;
	
	// Default Constructor
	private DBConnection()
	{
		
	}
	
	private static Connection getConnection() 
	{
		Connection conn = null;
		try 
		{
			Class.forName(DRIVERCLASS);// Optional
			
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
		
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return conn;
	}

	public static Connection getDBInstance() 
	{
		if(conn == null) 
		{
			conn = DBConnection.getConnection();
		}
		return conn;
	}
}
