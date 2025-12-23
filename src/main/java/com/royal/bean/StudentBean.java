package com.royal.bean;

public class StudentBean 
{
	private int rno;
	private String name;
	private int std;
	
	public StudentBean() 
	{
	}
	
	public StudentBean(int rno, String name, int std) {
		this.rno = rno;
		this.name= name;
		this.std = std;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setNameString(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	
	

}
