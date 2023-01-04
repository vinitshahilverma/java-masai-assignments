package com.control;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.beans.Student;
import com.dao.StudentDao;
import com.dao.StudentDaoImpl;


@Service
public class StudentService {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.println("enter student roll:");
		student.setRoll(sc.nextInt());
		System.out.println("enter student name:");
		student.setName(sc.next());
		System.out.println("enter student marks:");
		student.setMarks(sc.nextInt());

		StudentDao sdao = new StudentDaoImpl();
		String res = sdao.saveStudent(student);

		System.out.println(res);

		System.out.println("end of student service");

	}

	public void addStudent() {
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.println("enter student roll:");
		student.setRoll(sc.nextInt());
		System.out.println("enter student name:");
		student.setName(sc.next());
		System.out.println("enter student marks:");
		student.setMarks(sc.nextInt());

		StudentDao sdao = new StudentDaoImpl();
		String res = sdao.saveStudent(student);

		System.out.println(res);

		System.out.println("end of student service");
	}
}
