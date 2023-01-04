package com.masai;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

@Service
public class StudentService {
	
	@Autowired
	private Map<Student,Course> theMap;
	
	@Autowired
	private List<Student> theList;
	
	@Value("${appName}")
	private String appName;
	
	public void printMap() {
		
		System.out.println(theMap);
	}
	
	public void printList() {
		
	   theList.stream().sorted((s1,s2) -> s1.getMarks()> s2.getMarks() ? 1 : -1)
	                   .forEach(s -> System.out.println(s));
	             
	}
	
	public void printAppName() {
		
		System.out.println(appName);
		
	}
	
	

}
