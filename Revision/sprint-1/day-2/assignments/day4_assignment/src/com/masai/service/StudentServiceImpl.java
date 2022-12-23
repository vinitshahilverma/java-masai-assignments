package com.masai.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.masai.bean.Student;

public class StudentServiceImpl implements StudentService{
	
	List<Student> list = new ArrayList<>();
	@Override
	public List<Student> addstudent(Student student) {
		
		int id = student.hashCode();
		
		student.setId(id);
		
		if(list.contains(student)) {
			System.out.println("Student already present..");
		}
		else {
			list.add(student);
		}
		
		return list;
	}

	@Override
	public String deleteStudent(int id) {
		
		boolean flag = list.removeIf( s -> s.getId()==id);
		
		if(flag==true) {
			return "Yes";
		}
		else {
			return "No";
		}
	}

	@Override
	public Student findStudent(int id) {
		
		Student stu = list.stream().filter( s -> s.getId()==id).findAny().orElse(null);
		             
          return stu;
	}

	@Override
	public List<Student> findStudentWithPincode(String pincode) {
		
		List<Student> students =list.stream().filter( s -> s.getAddress().getPincode().equals(pincode))
		             .collect(Collectors.toList());
		
		return students;
		
	}

	@Override
	public List<Student> sortWithName() {
		
//		Collections.sort(list,(s1,s2) -> s1.getName().compareTo(s2.getName()));
		
		List<Student> list2 = list.stream().sorted((s1,s2) -> s1.getName().compareTo(s2.getName()))
		             .collect(Collectors.toList());
		
		return list2;
		
	}

	@Override
	public List<Student> setOfMarks() {
		
		HashMap<Integer,Student> hs = new HashMap<>();
		
		for(Student s:list) {
			   if(!hs.containsKey(s.getMarks())) {
				   hs.put(s.getMarks(), s);
			   }
		}
			
		Collection<Student> col = hs.values();
		
		List<Student> list2 = new ArrayList<>(col);
		
		return list2;
		
	}

	@Override
	public List<Student> addAllStudents(List<Student> students) {
		
		   list.addAll(students);
		   
		   List<Student> list1 = list.stream().sorted((s1,s2) -> s1.getMarks()>s2.getMarks() ? 1 : -1)
				                              .collect(Collectors.toList());
		   
		   return list1;
		
	}

}
