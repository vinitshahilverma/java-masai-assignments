package com.useCase;

import java.util.List;

public class Collage {

	private String collage_name;
	private String collage_address;
	private List<Student> students;

	

	public String getCollage_name() {
		return collage_name;
	}



	public void setCollage_name(String collage_name) {
		this.collage_name = collage_name;
	}



	public String getCollage_address() {
		return collage_address;
	}



	public void setCollage_address(String collage_address) {
		this.collage_address = collage_address;
	}



	public List<Student> getStudents() {
		return students;
	}



	public void setStudents(List<Student> students) {
		this.students = students;
	}



	public void showDetail() {
		 
		System.out.println("Collage name is: " + collage_name);
		System.out.println("Collage address is: "+collage_address);
		students.forEach(s -> {
			System.out.println("Student is: " + s);
			System.out.println("=============================================================");
		});
	}
	

}
