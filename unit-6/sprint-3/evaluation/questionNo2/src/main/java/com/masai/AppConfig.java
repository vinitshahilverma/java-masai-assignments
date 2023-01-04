package com.masai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("a1.properties")
public class AppConfig {
	
	@Bean
	public List<Student> students(){
		
		List<Student> list = new ArrayList(); 
			
		list.add(new Student(10,"shahil","shahil@gmail.com","Bokaro",150));
		list.add(new Student(11,"vinit","vinit@gmail.com","Ranchi",250));
		list.add(new Student(12,"verma","verma@gmail.com","Mumbai",350));
		list.add(new Student(13,"yash","yash@gmail.com","Kolkata",200));
		list.add(new Student(14,"sumit","sumit@gmail.com","Korba",175));
				
	    return list;
	}
	
	@Bean
	public Map<Student,Course> theMap(){
		
		Map<Student,Course>  map = new LinkedHashMap<>();
		
		
		map.put(new Student(10,"shahil","shahil@gmail.com","Bokaro",150),new Course(100,"Java","6months",10000));
		map.put(new Student(11,"vinit","vinit@gmail.com","Ranchi",250),new Course(101,"Hibernate","3months",50000));
		map.put(new Student(12,"verma","verma@gmail.com","Mumbai",350),new Course(102,"SpringBoot","4months",20000));
		
		return map;
		
	}
	
	

}
