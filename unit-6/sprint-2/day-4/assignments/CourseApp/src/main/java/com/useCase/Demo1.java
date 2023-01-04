package com.useCase;

import javax.persistence.EntityManager;

import com.masai.beans.Course;
import com.masai.beans.Student;
import com.utility.EMUtil;

public class Demo1 {

	public static void main(String[] args) {

           EntityManager em = EMUtil.provideEntityManager();
           
          Student s1 = new Student();
          s1.setName("Shahil");
          s1.setEmail("shahil@gmail.com");
          s1.setMobile("7858869630");
          
          
          Student s2 = new Student();
          s2.setName("Verma");
          s2.setEmail("verma@gmail.com");
          s2.setMobile("7858869631");
          
          Student s3 = new Student();
          s3.setName("Vinit");
          s3.setEmail("vinit@gmail.com");
          s3.setMobile("7858869632");
          
          
          Course c1 = new Course();
          c1.setCourseName("Java");
          c1.setDuration("6 month");
          c1.setFee(100000);
          
          
          Course c2 = new Course();
          c2.setCourseName("Hibernate");
          c2.setDuration("2 month");
          c2.setFee(200000);
          
          Course c3 = new Course();
          c3.setCourseName("HTML");
          c3.setDuration("3 month");
          c3.setFee(50000);
          
          c1.getStudent().add(s1);
          c1.getStudent().add(s2);
          
          c2.getStudent().add(s2);
          c2.getStudent().add(s3);
          
          c3.getStudent().add(s1);
          c3.getStudent().add(s3);
          
          
          s1.getCourse().add(c1);
          s1.getCourse().add(c3);
          
          s2.getCourse().add(c1);
          s2.getCourse().add(c2);
          
          s3.getCourse().add(c2);
          s3.getCourse().add(c3);
          
          
          em.getTransaction().begin();
          
          em.persist(c1);
          em.persist(c2);
          em.persist(c3);
          
          em.getTransaction().commit();
          
          System.out.println("done...");
          
          em.close();

	}

}
