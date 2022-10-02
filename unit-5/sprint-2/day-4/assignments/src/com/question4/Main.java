package com.question4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class Main {

	public static void main(String[] args) {
		

		
		   Set<Student> list = new HashSet<>();
		
		    list.add(new Student(10,"N1",500));
			list.add(new Student(12,"N2",700));
			list.add(new Student(13,"N3",600));
			list.add(new Student(14,"N4",550));
			list.add(new Student(10,"N1",500));
	   
		  List<Student> newList =  list.stream().filter(s -> s.getMarks() > 500)
		                .collect(Collectors.toList());
		   
		  Set<Student> s1 = new HashSet<>(newList);
		  
		  s1.stream().forEach(s -> System.out.println(s));
          
	}

}
