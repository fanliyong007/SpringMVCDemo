package com.mycom.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycom.spring.entity.Major;

@Repository
//Repository对应数据访问层Bean
@Transactional
public class MajorDao
{
	@Autowired
	private SessionFactory sessionFactory;
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	public List<Major> getAll()
	{
		String hql="FROM Major";
		return getSession().createQuery(hql).list();
	}
}
