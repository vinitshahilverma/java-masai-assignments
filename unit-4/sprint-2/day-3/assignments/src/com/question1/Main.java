package com.question1;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "shahil", 80, 300);
		
		Student student2 = new Student();
		student2.setAge(69);
		student2.setRoll(2);
		student2.setName("vinit");
		student2.setMarks(400);
		
		System.out.println("==========Student1=========");
         
		if(student1.getAge()==0) {
			System.out.println("Please Enter valid age");
		}
		else {
			System.out.println("Age is "+student1.getAge());
		}
	    
	    
	    if(student1.getMarks()==0) {
	    	System.out.println("Please Enter valid marks");
	    }
	    else {
	        System.out.println("Marks is "+student1.getMarks());
	    }
	    		
	    System.out.println("Name is "+student1.getName());
	    System.out.println("Roll is" +student1.getRoll());
	    
	    System.out.println("==========Student2=========");
	    
	    if(student2.getAge()==0) {
			System.out.println("Please Enter valid age");
		}
		else {
			System.out.println("Age is "+student2.getAge());
		}
	    
	    
	    if(student2.getMarks()==0) {
	    	System.out.println("Please Enter valid marks");
	    }
	    else {
	        System.out.println("Marks is "+student2.getMarks());
	    }
	    System.out.println("Name is "+student2.getName());
	    System.out.println("Roll is "+student2.getRoll());
	}

}
