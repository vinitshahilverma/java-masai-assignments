package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService cService;

	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourseHandler() throws CourseException {

		List<Course> courses = cService.getAllCourses();

		return new ResponseEntity<List<Course>>(courses, HttpStatus.OK);

	}

	@GetMapping("/courses/{id}")
	public ResponseEntity<Course> getCourseByIdHandler(@PathVariable("id") Integer id) throws CourseException {

		Course course = cService.getCourseById(id);

		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}
  
	@DeleteMapping("/courses/{id}")
	public ResponseEntity<Course> deleteCourseByIdHandler(@PathVariable("id") Integer id) throws CourseException {

		Course course = cService.getCourseById(id);

		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}
	
	@PutMapping("/courses/{id}")
	public ResponseEntity<Course> updateCourseByIdHandler(@RequestBody Course course,@PathVariable("id") Integer id) throws CourseException {

		Course course1 = cService.updateCourse(id, course);

		return new ResponseEntity<Course>(course1, HttpStatus.OK);
	}
	
	@PostMapping("/courses")
	public ResponseEntity<Course> addCourseHandler(@RequestBody Course course) throws CourseException {

		Course course1 = cService.AddCourse(course);

		return new ResponseEntity<Course>(course1, HttpStatus.CREATED);
	}
	
	@GetMapping("/getStudentByCourseId/{cid}")
	public ResponseEntity<List<Student>> getStudentListHandler(@PathVariable("cid") Integer cid) throws CourseException, StudentException {

		List<Student> student = cService.getListOfStudentfromCourse(cid);

		return new ResponseEntity<List<Student>>(student, HttpStatus.OK);
	}
	

}
