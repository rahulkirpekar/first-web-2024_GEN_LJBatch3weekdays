package com.royal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.royal.bean.StudentBean;
import com.royal.util.DBConnection;

public class StudentDao {

	public int insertStudent(StudentBean sbean) 
	{
		String hobbies[] = sbean.getHobby();
		String hobbiesStr = "";
		
		for( int i = 0 ;i < hobbies.length;i++) 
		{
			if(i < (hobbies.length-1)) 
			{
				hobbiesStr = hobbiesStr + hobbies[i]+"," ;
			}else 
			{
				hobbiesStr = hobbiesStr + hobbies[i] ;
			}
		}
		
		String insertQuery = "INSERT INTO student(full_name,age,course,gender,hobbies,date_of_birth,email,mobile,address) "
				+ "VALUES('"+sbean.getFullname()+"',"+sbean.getAge()+",'"+sbean.getCourse()+"','"+sbean.getGender()+"','"+hobbiesStr+"','"+sbean.getDob()+"','"+sbean.getEmail()+"','"+sbean.getMobile()+"','"+sbean.getAddress()+"')";
		
		System.out.println("insertQuery : " + insertQuery);
		
		
		Connection conn = DBConnection.getDBInstance();
		int rowsAffected  = 0 ; 
		Statement stmt = null;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(insertQuery);
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("DB not connected : " + conn);
		}
		return rowsAffected ;	
	}

	public ArrayList<StudentBean> getAllStudentRecords() 
	{
		String selectQuery = "SELECT * FROM student";
		
		Connection conn = DBConnection.getDBInstance();
		Statement stmt = null;
		ResultSet rs = null;
		StudentBean sbean = null;
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next()) 
				{
					int id = rs.getInt(1);
					String fullName  = rs.getString(2);
					int age = rs.getInt(3);
					String course = rs.getString(4);
					String gender = rs.getString(5);
					String hobbiesStr = rs.getString(6);
					String dob  = rs.getString(7);
					String email = rs.getString(8);
					String mobile = rs.getString(9);
					String address = rs.getString(10);
					
					// String -- String Array --- ,
					
					String hobbies[] = hobbiesStr.split(",");
					
					sbean = new StudentBean(id, fullName, age, course, gender, hobbies, dob, email, mobile, address);
					list.add(sbean);
				}
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---getAllStudentRecords() DB not connected");
		}
		return list;
	}
}


















