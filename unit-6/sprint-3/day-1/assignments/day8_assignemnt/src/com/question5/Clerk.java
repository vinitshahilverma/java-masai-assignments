package com.question5;

public class Clerk implements Person{
	
	 public void registerStudent() {
		 
		 System.out.println("enroll the Student in Collage..");
		 
	 }

	@Override
	public void dotask() {
		
		registerStudent();
		
	}

}
