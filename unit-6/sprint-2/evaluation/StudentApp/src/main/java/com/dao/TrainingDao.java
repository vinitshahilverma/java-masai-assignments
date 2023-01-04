package com.dao;

import java.util.List;

import com.Exception.CourseException;
import com.Exception.TeacherException;
import com.masai.beans.Course;
import com.masai.beans.Student;
import com.masai.beans.Teacher;

public interface TrainingDao {

	public void addCourse(Course course);

	public void registerStudent(Student student,int courseId)throws CourseException;

	public void registerTeacher(Teacher teacher);

	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException;
	
	public List<Student> getAlltheStudentsByCourseName(String courseName)throws CourseException;

}
