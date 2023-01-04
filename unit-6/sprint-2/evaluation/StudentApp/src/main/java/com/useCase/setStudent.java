package com.useCase;

import java.util.Scanner;

import com.Exception.CourseException;
import com.dao.TrainingDao;
import com.dao.TrainingDaoImpl;
import com.masai.beans.Student;

public class setStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter course Id..");
		int id = sc.nextInt();
		
		Student student = new Student();
		System.out.println("Enter Student name");
		student.setName(sc.next());
		
		System.out.println("Enter Student email");
		student.setEmail(sc.next());
		
		System.out.println("Enter student mobile");
		student.setMobile(sc.next());
		
		
		TrainingDao dao = new TrainingDaoImpl();
		
		
		try {
			dao.registerStudent(student, id);
		} catch (CourseException e) {
			System.out.println(e.getMessage());
		}

	}

}
