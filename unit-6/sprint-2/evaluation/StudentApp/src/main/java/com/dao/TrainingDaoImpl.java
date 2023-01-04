package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.Exception.CourseException;
import com.Exception.TeacherException;
import com.masai.beans.Course;
import com.masai.beans.Student;
import com.masai.beans.Teacher;
import com.utility.EMUtil;

public class TrainingDaoImpl implements TrainingDao {

	@Override
	public void addCourse(Course course) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		 em.getTransaction().begin();
		 
		 em.persist(course);
		 
		 em.getTransaction().commit();
		 
		 System.out.println("Done...");
		 
		 em.close();
		
	}

	@Override
	public void registerStudent(Student student, int courseId) throws CourseException {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Course cour = em.find(Course.class, courseId);
		
		if(cour!=null) {
			
			cour.getStudent().add(student);
			
			 em.getTransaction().begin();
			 
			 em.persist(student);
			 
			 em.getTransaction().commit();
			 
			 System.out.println("Done...");
			 
			 em.close();
			
		}
		else {
			
			throw new CourseException("course not found");
			
		}
		
		
	}

	@Override
	public void registerTeacher(Teacher teacher) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		 em.getTransaction().begin();
		 
		 em.persist(teacher);
		 
		 em.getTransaction().commit();
		 
		 System.out.println("Done...");
		 
		 em.close();
		
	}

	@Override
	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException {
              
		EntityManager em = EMUtil.provideEntityManager();
		
		Teacher tea = em.find(Teacher.class, teacherId);
		Course cour = em.find(Course.class, courseId);
		
		if(tea==null) {
			throw new TeacherException("Teacher not found...");
			
		}
		if(cour==null) {
			throw new CourseException("Course not found..");
			
		}
		else {
			
			  tea.getCourse().add(cour);
			  cour.setTeacher(tea);
			  
			     em.getTransaction().begin();
				 
				 em.persist(tea);
				 em.persist(cour);
				 
				 em.getTransaction().commit();
				 
				 System.out.println("Done...");
				 
				 em.close();
			
		}
             
		
	}

	@Override
	public List<Student> getAlltheStudentsByCourseName(String courseName) throws CourseException {
		    List<Student> student = null;
		    
		    EntityManager em = EMUtil.provideEntityManager();
		    
		    String jpql = "from Course where courseName=:name";
		    
		    TypedQuery<Course> q = em.createQuery(jpql,Course.class);
		    
		    q.setParameter("name", courseName);
		    
		    Course cour = q.getSingleResult();
		    
		     student = cour.getStudent();
		    
		    if(student.size()==0) {
		    	throw new CourseException("Student not found...");
		    }
		    
		    
		    return student;
	}

}
