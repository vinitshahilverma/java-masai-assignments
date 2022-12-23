package com.masai.service;

import java.util.List;

import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;

public interface CourseService {
	
	public Course getCourseById(Integer id)throws CourseException;
	
	public List<Course> getAllCourses()throws CourseException;
	
	public Course deleteCourse(Integer id)throws CourseException;
	
	public Course updateCourse(Integer id,Course course)throws CourseException;
	
	public Course AddCourse(Course course)throws CourseException;
	
	public List<Student> getListOfStudentfromCourse(Integer id)throws CourseException,StudentException;

}
