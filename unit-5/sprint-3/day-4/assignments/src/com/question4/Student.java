package com.question4;

import java.io.Serializable;

public class Student implements Serializable {

	private int roll;
	private String name;
	private int marks;
	Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int marks, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	

}
