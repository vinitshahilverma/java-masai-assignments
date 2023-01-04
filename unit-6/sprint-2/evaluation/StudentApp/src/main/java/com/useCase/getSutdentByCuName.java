package com.useCase;

import java.util.List;
import java.util.Scanner;

import com.Exception.CourseException;
import com.dao.TrainingDao;
import com.dao.TrainingDaoImpl;
import com.masai.beans.Student;

public class getSutdentByCuName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter course name");
		String name = sc.next();
		
		TrainingDao dao = new TrainingDaoImpl();
		try {
			List<Student> stu = dao.getAlltheStudentsByCourseName(name);
			
			stu.forEach(s -> System.out.println(s));
			
		} catch (CourseException e) {
			System.out.println(e.getMessage());
		}

	}

}
