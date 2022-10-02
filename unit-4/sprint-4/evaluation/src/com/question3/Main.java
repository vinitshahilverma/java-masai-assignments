package com.question3;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

        TreeSet<Student> student = new TreeSet<>();
        
        
           student.add(new Student(1,"a",20,20,20));
           student.add(new Student(2,"c",40,40,40));
           student.add(new Student(3,"b",30,30,30));
           
           System.out.println(student);

	}

}
