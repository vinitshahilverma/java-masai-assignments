package com.useCase;

import java.util.Scanner;

import com.Exception.CourseException;
import com.Exception.TeacherException;
import com.dao.TrainingDao;
import com.dao.TrainingDaoImpl;

public class teacherWithCourse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter course id..");
		int cId = sc.nextInt();
		
		System.out.println("Enter teacher id");
		int tid = sc.nextInt();
		
		TrainingDao dao = new TrainingDaoImpl();
		
		try {
			dao.assignTeacherWithCourse(tid,cId);
		} catch (TeacherException | CourseException e) {
			System.out.println(e.getMessage());
		}

	}

}
