package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("a1.properties")
public class AppConfig {
	
	@Autowired
	private Environment env;
	
   @Bean
	public List<String> cities(){
		
		List<String> list = new ArrayList<>();
        
		for(int i=1; i<6; i++) {
			
			String str = "city"+i;
			
			list.add(env.getProperty(str));

		}
		
		return list;
         		
	}
   
   @Bean
	public List<Student> students(){
		
		List<Student> list = new ArrayList<>();
       
		list.add(new Student(10,"Shahil",100));
		list.add(new Student(11,"Sandy",300));
		list.add(new Student(12,"Verma",400));
		list.add(new Student(13,"Yash",500));
		list.add(new Student(14,"Sumit",600));
		
		return list;
        		
	}

}
