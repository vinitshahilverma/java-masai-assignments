package com.masai.service;

import java.util.List;

import com.masai.bean.Student;

public interface StudentService {
	
	List<Student> addstudent(Student student);
	
	String deleteStudent(int id);
	
	Student findStudent(int id);
	
	List<Student> findStudentWithPincode(String pincode);
	
	List<Student> sortWithName();
	
	List<Student> setOfMarks();
	
	List<Student> addAllStudents(List<Student> students);
	

}
