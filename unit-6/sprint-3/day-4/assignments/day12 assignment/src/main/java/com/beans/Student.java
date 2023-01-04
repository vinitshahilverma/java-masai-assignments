package com.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

@Repository
public class Student {
	
	private int roll;
	private String name;
	private int marks;

	public Student() {
		super();
	}

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@PostConstruct
	public void mySetup() {
		System.out.println("Inside the init method of student");
	}

	@PreDestroy
	public void destory() {
		System.out.println("Inside the destroy method of student");
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

}
