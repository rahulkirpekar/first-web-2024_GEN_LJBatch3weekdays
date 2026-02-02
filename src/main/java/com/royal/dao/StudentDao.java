package com.royal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.royal.bean.StudentBean;
import com.royal.util.DBConnection;


//StudentDao-------Student(Table)

public class StudentDao 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO student(full_name,age,course,gender,hobbies,date_of_birth,email,mobile,address) "
				+ "VALUES('"+sbean.getFullname()+"',"+sbean.getAge()+",'"+sbean.getCourse()+"','"+sbean.getGender()+"','"+sbean.getHobbiesStr()+"','"+sbean.getDob()+"','"+sbean.getEmail()+"','"+sbean.getMobile()+"','"+sbean.getAddress()+"')";
		
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
	
	public boolean isUserEmailUnique(String email) 
	{
		String isAvailableEmailQuery = "SELECT * from student WHERE email='"+email+"'";
		
		System.out.println("isAvailableEmail : " + isAvailableEmailQuery);
		
		Connection conn = DBConnection.getDBInstance();
		Statement stmt = null;
		ResultSet rs = null;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rs = stmt.executeQuery(isAvailableEmailQuery);
				
				if (rs.next()) 
				{
					return false;
				}
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---isUserEmailUnique() DB not connected");
		}
		return true;
	}

	public int deleteStudentbyId(int id) 
	{
		String deleteQuery = "DELETE FROM student WHERE id = "+id;

		Connection conn = DBConnection.getDBInstance();
		int rowsAffected  = 0 ; 
		Statement stmt = null;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(deleteQuery);
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

	public StudentBean getStudentById(int id) 
	{
		String selectQuery = "SELECT * FROM student WHERE id="+id;
		
		Connection conn = DBConnection.getDBInstance();
		Statement stmt = null;
		ResultSet rs = null;
		StudentBean sbean = null;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rs = stmt.executeQuery(selectQuery);
				
				rs.next(); 

				int id1 = rs.getInt(1);
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
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---getAllStudentRecords() DB not connected");
		}
		return sbean;
	}
}


















