package com.masai.bean;

import java.io.Serializable;

public class Student extends Person implements Serializable {

	private int rollNo;
	private int marks;

	public Student(int id, String name, int age, int rollNo, int marks) {
		super(id, name, age);
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
	

}
