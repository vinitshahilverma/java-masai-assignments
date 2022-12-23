package com.masai.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.repository.CourseRepo;
import com.masai.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo sRepo;
	
	@Autowired
	private CourseRepo cRepo;
	
	@Autowired
	private CourseService cService;

	@Override
	public List<Student> getAllStudents() throws StudentException {
		
		List<Student> list = sRepo.findAll();
		
		if(list.size()==0) throw new StudentException("No student found..");
		
		return list;
		
	}

	@Override
	public Student getStudentById(Integer id) throws StudentException {
		
		  Student student = sRepo.findById(id)
		                         .orElseThrow(() -> new StudentException("No student found..")); 
		  
		  return student;
		
	}

	@Override
	public Student updateStudent(Integer id, Student student) throws StudentException {
		
		Student student2 = sRepo.findById(id)
                .orElseThrow(() -> new StudentException("No student found..")); 
		
		student.setId(id);
		
		student = sRepo.save(student);
		
		return student;
		
	}

	@Override
	public Student deleteStudent(Integer id) throws StudentException {
		
		Student student = sRepo.findById(id)
                .orElseThrow(() -> new StudentException("No student found.."));
		
//		try {
//			List<Course> courses = cService.getAllCourses();
//			
//			 courses.stream().map(c -> c.getStudents().remove(id))
//			                .collect(Collectors.toList());
//                
//			for(Course c:courses) {
//				   cRepo.save(c);
//			}
//                            
//			
//		} catch (CourseException e) {
//			
//			e.printStackTrace();
//			
//		}
		
		 sRepo.delete(student);
		 
		 return student;
	}

	@Override
	public Student addStudent(Student student) throws StudentException {
		
		if(student!=null) {
			
			student = sRepo.save(student);
			
			return student;
			
		}
		else throw new StudentException("Student can't be null...");
		
	}

	@Override
	public List<Course> getAllCourseByStudentId(Integer id) throws StudentException,CourseException{
		
		Student student = sRepo.findById(id)
                .orElseThrow(() -> new StudentException("No student found..")); 
		
		  List<Course> courses = student.getCourses();
		  
		  if(courses.size()==0) throw new CourseException();
		  
		  return courses;
		
	}

	@Override
	public Student registerStudentInACourse(Integer sId, Integer cId) throws StudentException, CourseException {
         
		Student student = sRepo.findById(sId)
                .orElseThrow(() -> new StudentException("No student found..")); 
		
		Course course = cRepo.findById(cId)
	             .orElseThrow(() -> new CourseException("No course found..."));
		
		student.getCourses().add(course);
		
		sRepo.save(student);
		
		return student;
   
	}

}
