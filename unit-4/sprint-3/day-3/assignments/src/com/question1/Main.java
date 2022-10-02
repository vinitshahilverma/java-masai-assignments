package com.question1;

public class Main {
    
	public static Person generatePerson(Person person) {
	      
			 person.name = "Shahil";
			  person.gender = "male";
			  if(person instanceof Student) {
			  Student s1 = (Student)person;
			    s1.studentId = 1;
			    s1.courseFee = 300000;
			    s1.courseEnrolled = "JA111";
			    s1.add.city = "Chennai";
			    s1.add.state = "TN";
			    s1.add.pinCode = "60001";
			  }
		 else {
			 person.name = "Ratan";
			 person.gender = "male";
			 Instructor i1 = (Instructor)person;
			 i1.instructorId = 456;
			 i1.salary = 45612;
			 i1.add.city = "Chennai";
			 i1.add.state = "TN";
			 i1.add.pinCode = "60001";
		 }
		
	
		return person;		
	}
	
	public static void main(String[] args) {
		
		Person newStudent = generatePerson(new Student());
		
		Person newTeacher = generatePerson(new Instructor());
          
		System.out.println(newStudent);
		System.out.println(newTeacher);
	}

}
