package com.useCase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.beans.Collage;
import com.masai.beans.Student;
import com.utility.EMUtil;

public class getStudentByCollageId {

	public static void main(String[] args) {

       EntityManager em = EMUtil.provideEntityManager();
       
       String jpql = "from Student where collage_collageId = (select collageId from Collage where collageId =:id)";
       
        TypedQuery<Student> q = em.createQuery(jpql, Student.class);
        
        q.setParameter("id", 1);
        
        List<Student> list = q.getResultList();
        
        list.forEach(s -> {
        	  System.out.println(s);
        });
        
        em.close();  
 	}

}
