package com.question3;

import java.util.Scanner;

public class Course {
    
	 int courseId;
	 String courseName;
	 int courseFee;
	 
	 
	 public void displayCourseDetails() {
		 
		 System.out.println("Course id : " +this.courseId);
		 System.out.println("Course name : " +this.courseName);
		 System.out.println("Course Fee : " +this.courseFee);
		 
	 }
	 
	 public static void authenticate() {
		 
		 Scanner sc = new Scanner(System.in);
		 
		   System.out.println("Enter Username");
		   
		       String username = sc.next();
		        
		   System.out.println("Enter Password");
		   
		      String password = sc.next();
		 
		 if(username.equals("Admin") && password.equals("1234")) {
                  
			    Course cr = new Course();
			  
			       cr.courseName = "Java";
			      
			       cr.courseId = 111;
			       
			       cr.courseFee = 100000;
			       
			       cr.displayCourseDetails();
			       	       
		 }
		 else {
			 System.out.println("Invalid Username or password");
		 }
		 
	 }
	
	
	
	public static void main(String[] args) {
	
             authenticate();
             authenticate();

    }

}