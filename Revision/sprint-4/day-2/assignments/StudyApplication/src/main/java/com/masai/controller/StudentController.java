package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService sService;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAlltheStudentHandler() throws StudentException{
		
		List<Student> list = sService.getAllStudents();
		
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentByIdHandler(@PathVariable("id") Integer id) throws StudentException{
		
		Student student = sService.getStudentById(id);
	
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Student> deleteStudentByIdHandler(@PathVariable("id") Integer id) throws StudentException{
		
		Student student = sService.deleteStudent(id);
	
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@PostMapping("/students")
	public ResponseEntity<Student> addStudentHandler(@RequestBody Student student) throws StudentException{
		
		Student student1 = sService.addStudent(student);
	
		return new ResponseEntity<Student>(student1,HttpStatus.OK);
	}
	
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updatedStudentHandler(@RequestBody Student student,@PathVariable("id") Integer id) throws StudentException{
		
		Student student1 = sService.updateStudent(id, student);
	
		return new ResponseEntity<Student>(student1,HttpStatus.OK);
	}
	
	
	@GetMapping("/getCoursesOfStudent/{id}")
	public ResponseEntity<List<Course>> getAlltheCoursesOfStudentHandler(@PathVariable("id") Integer id) throws StudentException, CourseException{
		
		List<Course> list = sService.getAllCourseByStudentId(id);
		
		return new ResponseEntity<List<Course>>(list,HttpStatus.OK);
		
	}
	
	@PatchMapping("/students/{sid}/course/{cid}")
	public ResponseEntity<Student> registerStudentInCourseHandler(@PathVariable("sid") Integer sid,@PathVariable("cid") Integer cid) throws StudentException, CourseException{
		
		Student student = sService.registerStudentInACourse(sid, cid);
	
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
}
