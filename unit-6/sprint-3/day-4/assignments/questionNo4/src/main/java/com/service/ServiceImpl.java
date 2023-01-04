package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.StudentImpl;
import com.util.Student;

@Service
public class ServiceImpl implements ServiceDao{
    
	@Autowired
	private StudentImpl si;
	
	@Override
	public String saveStudent(Student stu) {
		
		return si.saveStudent(stu);
		
	}

}
