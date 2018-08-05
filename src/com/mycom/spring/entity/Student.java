package com.mycom.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="sp_Student")
@GenericGenerator(name="genID",strategy="native")
public class Student
{
	private Integer id;
	private String name;
	private String gender;
	private String email;
	private Date birth;
	private Date regTime;
	private String phone;
	private Major major;
	
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", birth=" + birth
				+ ", regTime=" + regTime + ", phone=" + phone + ", major=" + major + "]";
	}
	@Id
	@GeneratedValue(generator="genID")
	@Column(name="ID",nullable=false,unique=true)
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	@Column(name="Name")
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@Column(name="Gender")
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	@Column(name="Email")
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	@Column(name="Birth")
	public Date getBirth()
	{
		return birth;
	}
	public void setBirth(Date birth)
	{
		this.birth = birth;
	}
	@Column(name="Reg_Time")
	public Date getRegTime()
	{
		return regTime;
	}
	public void setRegTime(Date regTime)
	{
		this.regTime = regTime;
	}
	@Column(name="Phone")
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	@Column(name="Major")
	public Major getMajor()
	{
		return major;
	}
	public void setMajor(Major major)
	{
		this.major = major;
	}
	
}
