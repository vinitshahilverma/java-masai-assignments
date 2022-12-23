package com.masai.bean;

import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	private int marks;
	private String section;
	
	private Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int marks, String section, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.section = section;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", section=" + section + ", address="
				+ address + "]";
	}

}
