package com.mycom.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycom.spring.dao.StudentDao;
import com.mycom.spring.entity.Student;

@Service
//表示其为service类
public class StudentService
{
	@Autowired
	private StudentDao studentDao;
	@Transactional
	public List<Student> getAll()
	{
		return studentDao.getAll();
	}
	@Transactional
	public Student get(Integer id)
	{
		return studentDao.get(id);
	}

	public boolean isNameVaild(String name)
	{
		return studentDao.getByName(name) == null;
	}

	public void delete(Integer id)
	{
		studentDao.delete(id);
	}

	public void saveOrUpdate(Student student)
	{
		studentDao.saveOrUpdate(student);
	}

	public Student getByName(String name)
	{
		return studentDao.getByName(name);
	}
}
