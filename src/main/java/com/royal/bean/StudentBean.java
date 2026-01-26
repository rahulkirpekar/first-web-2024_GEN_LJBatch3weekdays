package com.royal.bean;

public class StudentBean 
{
	private Integer id      = null;
	private String fullname = null;
	private Integer age      = null;
	private String course   = null;
	private String gender   = null;
	private String hobby[]    = null;
	private String dob      = null;
	private String email    = null;
	private String mobile   = null;
	private String address	= null;

	public StudentBean() 
	{
	}

	public StudentBean(Integer id, String fullname, Integer age, String course, String gender, String hobby[], String dob,
			String email, String mobile, String address) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.age = age;
		this.course = course;
		this.gender = gender;
		this.hobby = hobby;
		this.dob = dob;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	public StudentBean(String fullname, Integer age, String course, String gender, String hobby[], String dob,
			String email, String mobile, String address) {
		this.fullname = fullname;
		this.age = age;
		this.course = course;
		this.gender = gender;
		this.hobby = hobby;
		this.dob = dob;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String hobby[]) {
		this.hobby = hobby;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public boolean isAvailableHobby(String value) 
	{
		if(hobby == null) 
		{
			return false;
		}
		for (int i = 0; i < hobby.length; i++) 
		{
			if(hobby[i].equals(value)) 
			{
				return true;
			}
		}
		return false;		
	}
	
	
	public String getHobbiesStr()
	{
		
		String hobbies[] = getHobby();
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
		return hobbiesStr;
	}
}
