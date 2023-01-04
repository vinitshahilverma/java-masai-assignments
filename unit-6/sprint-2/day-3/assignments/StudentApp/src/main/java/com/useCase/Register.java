package com.useCase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.masai.beans.Collage;
import com.masai.beans.Student;
import com.utility.EMUtil;

public class Register {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

		Collage clg = new Collage();
		        clg.setCollageName("IIT");
		        clg.setCollageAddress("Mumbai");

		Student s1 = new Student();
		s1.setStudentName("Shahil");
		s1.setMobileNumber("7858896635");
		s1.setEmail("Shahil@gmail.com");
		s1.setCollage(clg);
	

		Student s2 = new Student();
		s2.setStudentName("Verma");
		s2.setMobileNumber("7858896636");
		s2.setEmail("Verma@gmail.com");
		s2.setCollage(clg);
		
		
		Student s3 = new Student();
		s3.setStudentName("Sandeep");
		s3.setMobileNumber("7858896638");
		s3.setEmail("Sandeep@gmail.com");
		s3.setCollage(clg);
		
		
		Student s4 = new Student();
		s4.setStudentName("Vicky");
		s4.setMobileNumber("7858896637");
		s4.setEmail("Vicky@gmail.com");
		s4.setCollage(clg);
		
		
		Collage clg1 = new Collage();
		   clg1.setCollageName("NIT");
		   clg1.setCollageAddress("Patna");
		
		
		Student s5 = new Student();
		s5.setStudentName("Vinit");
		s5.setMobileNumber("7858896631");
		s5.setEmail("Vinit@gmail.com");
		s5.setCollage(clg1);

		Student s6 = new Student();
		s6.setStudentName("Yash");
		s6.setMobileNumber("7858896632");
		s6.setEmail("Yash@gmail.com");
		s6.setCollage(clg1);
		
		Student s7 = new Student();
		s7.setStudentName("Sumit");
		s7.setMobileNumber("7858896633");
		s7.setEmail("Sumit@gmail.com");
		s7.setCollage(clg1);
		
		
		Student s8 = new Student();
		s8.setStudentName("Sandy");
		s8.setMobileNumber("7858896634");
		s8.setEmail("Sandy@gmail.com");
		s8.setCollage(clg1);
		
		
		List<Student> l1 = new ArrayList<>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		
		clg.setStudent(l1);
		
		List<Student> l2 = new ArrayList<>();
		l2.add(s5);
		l2.add(s6);
		l2.add(s7);
		l2.add(s8);
		
		clg1.setStudent(l2);
		
		
		em.getTransaction().begin();
		
		em.persist(clg);
		em.persist(clg1);
		
		em.getTransaction().commit();
		
		System.out.println("done...");
		
		em.close();

	}

}
