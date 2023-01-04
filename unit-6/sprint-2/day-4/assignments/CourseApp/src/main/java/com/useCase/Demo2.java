package com.useCase;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.beans.Course;
import com.masai.beans.Student;
import com.utility.EMUtil;

public class Demo2 {

	public static void main(String[] args) {

           EntityManager em = EMUtil.provideEntityManager();
           
           List<Student> slist =  em.find(Course.class, 3).getStudent();
           
           slist.forEach(s -> System.out.println(s));
           
           em.close();

	}

}
