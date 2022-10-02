package com.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(10,"N1",300,"Bokaro"));
		list.add(new Student(12,"N2",400,"Delhi"));
		list.add(new Student(14,"N3",550,"Mumbai"));
		list.add(new Student(16,"N4",600,"punjab"));
		list.add(new Student(18,"N5",700,"kolkata"));
		
		List<Employee> emp = list.stream().filter( s -> s.getMarks() > 500)
	                                .map( s -> {
			
		                                         Employee e1 = new Employee(); 
		                                         e1.setEmpId(s.getRoll());
		                                         e1.setAddress(s.getAddress());
		                                         e1.setSalary(s.getMarks() * 10000);
		                                         e1.setName(s.getName());
		         
			                                     return e1;
		                                         })
	                                             .collect(Collectors.toList());
		
		  
		                                         emp.stream().forEach(e -> System.out.println(e));
	                                }

                               }
