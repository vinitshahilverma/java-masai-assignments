package com.masai.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int teacherId;
	private String teacherName;
	private int noYearOfExperience;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Course> course = new ArrayList<>();

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", noYearOfExperience="
				+ noYearOfExperience + ", email=" + email + ", course=" + course + "]";
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getNoYearOfExperience() {
		return noYearOfExperience;
	}

	public void setNoYearOfExperience(int noYearOfExperience) {
		this.noYearOfExperience = noYearOfExperience;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Teacher(int teacherId, String teacherName, int noYearOfExperience, String email, List<Course> course) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.noYearOfExperience = noYearOfExperience;
		this.email = email;
		this.course = course;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
