package com.question2;

import java.util.Scanner;

public class Main {
  
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Students you want to enter");
		
		 int n = sc.nextInt();
		 
		 for(int i=1; i<=n; i++) {
			 
			 System.out.println("Enter the Name :");
			 
			 String name = sc.next();
			 
			 System.out.println("Enter the Roll Number :");
			 
			 int roll = sc.nextInt();
			 
			 System.out.println("Enter the marks :");
			 
			 int marks = sc.nextInt();
			 
			 
			 Student s1 = new Student();
			 
			 s1.setStudentName(name);
			 s1.setRollNumber(roll);
			 s1.setMarks(marks);
			 
			 System.out.println("Student Detail : "+i);
			 System.out.println("Student Roll Number : "+s1.getRollNumber());
			 System.out.println("Student Name : "+s1.getStudentName());
			 System.out.println("Student Mark : "+s1.getMarks());
			 
			 
			 System.out.println("====================================================");
		 }
		
	}
}
