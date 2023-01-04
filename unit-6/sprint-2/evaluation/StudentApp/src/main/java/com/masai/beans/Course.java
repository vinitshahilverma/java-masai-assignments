package com.masai.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Course {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int courseId;
	private String coursename;
	private String duration;
	private int fee;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Teacher teacher;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Student> student = new ArrayList<>();

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", coursename=" + coursename + ", duration=" + duration + ", fee=" + fee
				+ ", teacher=" + teacher + ", student=" + student + "]";
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public Course(int courseId, String coursename, String duration, int fee, Teacher teacher, List<Student> student) {
		super();
		this.courseId = courseId;
		this.coursename = coursename;
		this.duration = duration;
		this.fee = fee;
		this.teacher = teacher;
		this.student = student;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
