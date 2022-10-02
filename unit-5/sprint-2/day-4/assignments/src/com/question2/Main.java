package com.question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(10,"N1",500));
		list.add(new Student(12,"N2",700));
		list.add(new Student(13,"N3",600));
		list.add(new Student(14,"N4",550));
		list.add(new Student(15,"N5",380));
		
		Optional<Student> s3 = list.stream().max((s1,s2)-> s1.getMarks()>s2.getMarks() ? 1 : -1);
		
		System.out.println(s3);
		             
         
	}

}
