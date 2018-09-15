package com.mycom.spring.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycom.spring.entity.Student;;
@Repository
@Transactional
public class StudentDao
{
	@Autowired
	private SessionFactory sessionFactory;
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	public List<Student> getAll()
	{
		String hql="FROM Student s LEFT OUTER JOIN FETCH s.major";// s LEFT OUTER JOIN FETCH s.major
		return getSession().createQuery(hql).list();
	}
	public Student get(Integer id)
	{
		return getSession().get(Student.class, id);
	}
	public Student getByName(String name)
	{
		String hql="FROM Student s WHERE s.name=? ";
		return (Student)getSession().createQuery(hql).setString(0, name).uniqueResult();
	}
	public void delete(Integer id)
	{
		String hql="DELETE FROM Student s WHERE s.id=?";
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();
	}
	public void saveOrUpdate(Student student)
	{
		getSession().saveOrUpdate(student);
	}
}
