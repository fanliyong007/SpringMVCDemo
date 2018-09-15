package com.mycom.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycom.spring.dao.MajorDao;
import com.mycom.spring.entity.Major;
@Service
public class MajorService
{
	@Autowired
	private MajorDao majorDao;
	@Transactional
	public List<Major> getAll()
	{
		return majorDao.getAll();
	}
	
}
