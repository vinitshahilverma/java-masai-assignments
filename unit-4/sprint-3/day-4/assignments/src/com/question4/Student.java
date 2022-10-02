package com.question4;

import java.util.Scanner;

public class Student {
    
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public Student() {
		
	}
	
	public Student(int roll, String name, int marks, char grade) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
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

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}

	public void displayDeatils() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll");
		int rol = sc.nextInt();
		
		System.out.println("Enter name");
		String nam = sc.next();
		
		System.out.println("Enter marks");
		int mark = sc.nextInt();
		
		char grad = calculateGrade(mark);
			
		Student s1 = new Student(rol,nam,mark,grad);
		
		System.out.println(s1);
	}
	
	public char calculateGrade(int marks) {
		
		char alpha='D';
		
		if(marks>=500) {
			alpha = 'A';
		}
		else if(marks<500 && marks>=400) {
			alpha = 'B';
		}
		else if(marks<400) {
			alpha = 'C';
		}
		return alpha;
	}
}
