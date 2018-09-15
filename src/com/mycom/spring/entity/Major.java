package com.mycom.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="sp_Major")
@GenericGenerator(name="genID",strategy="native")
//hibernate提供的自定义主键生成策略的生成器，一般是要跟GeneratedValue这个一起使用
public class Major
{
	private Integer id;
	private String majorName;
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
	@Column(name="MAJOR_NAME")
	public String getMajorName()
	{
		return majorName;
	}
	public void setMajorName(String majorName)
	{
		this.majorName = majorName;
	}
	public Major(Integer id, String majorName)
	{
		super();
		this.id = id;
		this.majorName = majorName;
	}
	public Major()
	{
		super();
		// TODO Auto-generated constructor stub
	}
}
