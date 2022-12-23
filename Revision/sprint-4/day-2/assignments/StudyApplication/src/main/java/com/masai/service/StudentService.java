package com.masai.service;

import java.util.List;

import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudents()throws StudentException;
	
	public Student getStudentById(Integer id)throws StudentException;
	
	public Student updateStudent(Integer id,Student student)throws StudentException;
	
	public Student deleteStudent(Integer id)throws StudentException;
	
	public Student addStudent(Student student)throws StudentException;
	
	public List<Course> getAllCourseByStudentId(Integer id)throws StudentException,CourseException;
	
	public Student registerStudentInACourse(Integer sId,Integer cId)throws StudentException,CourseException;

}
