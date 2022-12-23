package com.masai.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.masai.bean.Address;
import com.masai.bean.Student;
import com.masai.service.StudentService;
import com.masai.service.StudentServiceImpl;

public class Main {

	public static void main(String[] args) {

         StudentService sService = new StudentServiceImpl();
         
         Scanner sc = new Scanner(System.in);
    	 
         
//         List<Student> list = sService.addstudent(new Student(10,"Shahil",500,"A",
//        		 new Address("Bokaro","JH","828404")));
//         
//         List<Student> list1 = sService.addstudent(new Student(12,"Verma",500,"A",
//        		 new Address("Bokaro","JH","828404")));
//         
//         List<Student> list4 = sService.addstudent(new Student(14,"vinit",800,"A",
//        		 new Address("Bokaro","JH","828404")));
// 
//           
//         List<Student> list3 = sService.setOfMarks();
//         
////         System.out.println(list3);
//         
//         List<Student> list5 = Arrays.asList(
//        		 
//        		 new Student(18,"Rahul",600,"A",new Address("Bokaro","JH","828425")),
//        		 new Student(16,"Rajan",700,"A",new Address("Bokaro","JH","828486"))
//        		 
//        		 );
//         
//          List<Student> list6 = sService.addAllStudents(list5);
//        		 
//         System.out.println(list6);
//         
//         
//         Student  s1  = sService.findStudent(112214009);
//         
//         System.out.println(s1);
         
         while(true) {
        	 
        	
        	 System.out.println("Press 1 to add student");
        	 System.out.println("Press 2 to delete student");
        	 System.out.println("Press 3 to get student by Id");
        	 System.out.println("Press 4 to get students by pincode");
        	 System.out.println("Press 5 to get the List of student sorted with names");
        	 System.out.println("Press 6 to get all the students with unique marks");
        	 System.out.println("Press 7 to add List of students");
        	 System.out.println("Press 8 Exit..");
        	 
        	 int choice = sc.nextInt();
        	 
        	 
        	 if(choice==1) {
        		 
        		 Student s1 = new Student();
        		 
        		 Address add = new Address();
        		 System.out.println("Enter student name");
        		 s1.setName(sc.next());
        		 
        		 System.out.println("Enter student marks");
        		 s1.setMarks(sc.nextInt());
        		 
        		 System.out.println("Enter student section");
        		 s1.setSection(sc.next());
        		 
        		 System.out.println("Enter student city");
        		 add.setCity(sc.next());
        		 
        		 System.out.println("Enter student state");
        		 add.setState(sc.next());
        		 
        		 System.out.println("Enter student pincode");
        		 add.setPincode(sc.next());
        		 
        		 s1.setAddress(add);
        		 
        		 List<Student> list = sService.addstudent(s1);
                  
        		 System.out.println(list);
        	 }
        	 
        	 else if(choice==2) {
        		 System.out.println("Enter student id");
        		 
        		 int id = sc.nextInt();
        		 
        		 String ans = sService.deleteStudent(id);
        		 
        		 System.out.println(ans);
        	 }
        	 
        	 else if(choice==3) {
        		 
                 System.out.println("Enter student id");
        		 
        		 int id = sc.nextInt();
        		 
        		 Student st = sService.findStudent(id);
        		 
        		 System.out.println(st);
        		 
        	 }
        	 
        	 else if(choice==4) {
        		 System.out.println("Enter pincode");
        		 
        		 String pincode  = sc.next();
        		 
        		 List<Student> list = sService.findStudentWithPincode(pincode);
        		 
        		 System.out.println(list);
        	 }
        	 
        	 else if(choice==5) {
        		 
        		 List<Student> list = sService.sortWithName();
        		 
        		 System.out.println(list);
        		 
        	 }
        	 
        	 else if(choice == 6) {
        		 
        		 List<Student> list = sService.setOfMarks();
        		 
        		 System.out.println(list);
        		 
        	 }
        	 
        	 else if(choice== 7) {
        		 System.out.println("Enter the number of students you want to add");
        	      
        		 int n = sc.nextInt();
        		 
        		 List<Student> list = new ArrayList<>();
        		 
        		 for(int i=0; i<n; i++) {
        			 
        			 System.out.println("Enter the details of student "+ (i+1));
        			 
        			 Student s1 = new Student();
            		 
            		 Address add = new Address();
            		 System.out.println("Enter student name");
            		 s1.setName(sc.next());
            		 
            		 System.out.println("Enter student marks");
            		 s1.setMarks(sc.nextInt());
            		 
            		 System.out.println("Enter student section");
            		 s1.setSection(sc.next());
            		 
            		 System.out.println("Enter student city");
            		 add.setCity(sc.next());
            		 
            		 System.out.println("Enter student state");
            		 add.setState(sc.next());
            		 
            		 System.out.println("Enter student pincode");
            		 add.setPincode(sc.next());
            		 
            		 s1.setAddress(add);
            		 
            		 list.add(s1);
        			 
        		 }
        		 
        		 List<Student> list2 = sService.addAllStudents(list);
        		
        		 System.out.println(list2);
        	 }
        	 
        	 else {
 
        		 break;
        	 }
        	 
         }
 
	}

}
