package com.Dao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.util.EMUtil;
import com.util.Student;

@Repository
public class StudentImpl implements StudentDao{

	@Override
	public String saveStudent(Student stu) {
		 
		EntityManager em = EMUtil.provideEntityManager();
		
	    em.getTransaction().begin();
	    
	    em.persist(stu);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "done";
	}

}
