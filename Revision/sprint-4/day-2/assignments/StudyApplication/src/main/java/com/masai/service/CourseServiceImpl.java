package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.repository.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepo cRepo;

	@Override
	public Course getCourseById(Integer id) throws CourseException {
		
		Course course = cRepo.findById(id)
				             .orElseThrow(() -> new CourseException("No course found..."));
		
		return course;
		
	}

	@Override
	public List<Course> getAllCourses() throws CourseException {
		
		List<Course> courses = cRepo.findAll();
		
		if(courses.size()==0) throw new CourseException("No course found...");
		
		return courses;
		
	}

	@Override
	public Course deleteCourse(Integer id) throws CourseException {
		
		Course course = cRepo.findById(id)
	             .orElseThrow(() -> new CourseException("No course found..."));
		
		cRepo.delete(course);
		
		return course;
		
	}

	@Override
	public Course updateCourse(Integer id, Course course) throws CourseException {
		
		Course course1 = cRepo.findById(id)
	             .orElseThrow(() -> new CourseException("No course found..."));
		
	     course.setCourseId(id);
	     
	     course = cRepo.save(course);
		
	     return course;
	}

	@Override
	public Course AddCourse(Course course) throws CourseException {
		
		if(course!=null) {
			
			 course = cRepo.save(course);
				
		     return course;
		}
		else throw new CourseException("No course found...");
		
	}

	@Override
	public List<Student> getListOfStudentfromCourse(Integer id) throws CourseException,StudentException{

		Course course = cRepo.findById(id)
	             .orElseThrow(() -> new CourseException("No course found..."));
		
		List<Student> students = course.getStudents();
		
		if(students.size()==0) throw new StudentException("No student found");
		
		return students;
	}

}
