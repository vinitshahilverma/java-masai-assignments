package com.question5;

import java.util.Scanner;

public class Demo {
	
	public static void print(Student s2,int i) {
		Student s1 = s2;
		System.out.println("==============================");

		System.out.println("Details of Student " + (i + 1));
		System.out.println("Roll Number is : " + s1.getRoll());
		System.out.println("Name is : " + s1.getName());
		System.out.println("Address Number is : " + s1.getAddress());
		System.out.println("Marks Number is : " + s1.getMarks());
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number of Student");

		int num = sc.nextInt();

		Student[] s1 = new Student[num];

		for (int i = 0; i < s1.length; i++) {

			s1[i] = new Student();

			System.out.println("Enter the roll number for Student " + (i + 1));
			int roll = sc.nextInt();

			System.out.println("Enter the name for Student " + (i + 1));
			String name = sc.next();

			System.out.println("Enter the address for Student " + (i + 1));
			String address = sc.next();

			System.out.println("Enter the marks number for Student " + (i + 1));
			int marks = sc.nextInt();

			s1[i].setRoll(roll);
			s1[i].setName(name);
			s1[i].setAddress(address);
			s1[i].setMarks(marks);

		}
		
		  int sum = 0;
		for (int i = 0; i < s1.length; i++) {
			
			print(s1[i],i);
			
		     sum = sum+s1[i].getMarks();
             
		}
		
		System.out.println("============Average of marks==========");
		
		System.out.println("Average is : " +sum/num);
 
	}

}
