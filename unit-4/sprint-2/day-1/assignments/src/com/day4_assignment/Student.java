package com.day4_assignment;

public class Student {
     
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Roll no is"+" "+roll);
		System.out.println("Name is"+" "+name);
		System.out.println("Marks is"+" "+marks);
	}
	
	
	public static void main(String[] args) {
		
           Student student1 = new Student();
           
           student1.roll = 1;
           student1.name = "Shahil";
           student1.marks = 95;
           student1.displayStudentDetails();
           
           Student student2 = new Student();
           
           student2.roll = 3;
           student2.name = "vinit";
           student2.marks = 89;
           student2.displayStudentDetails();
           
           student1 = null;
           
           student2 = null;
           
          
	}

}
