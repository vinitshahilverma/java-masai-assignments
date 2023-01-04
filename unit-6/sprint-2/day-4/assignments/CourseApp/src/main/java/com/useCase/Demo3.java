package com.useCase;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.beans.Course;
import com.masai.beans.Student;
import com.utility.EMUtil;

public class Demo3 {

	public static void main(String[] args) {
		
		 EntityManager em = EMUtil.provideEntityManager();
		 
		 List<Course> clist = em.find(Student.class,2).getCourse();
		 
		 clist.forEach( c -> {
			   System.out.println(c);
		 });
		 
		 em.close();
 		
	}

}
