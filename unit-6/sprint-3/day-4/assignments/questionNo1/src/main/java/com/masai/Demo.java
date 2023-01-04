package com.masai;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Demo {
	
	@Autowired
	List<String> cities;
	
	@Autowired
	List<Student> students;
	
	@PostConstruct
	public void start() {
		System.out.println("inside start method");
	}
	
	@PreDestroy
	public void end() {
		
		System.out.println("inside end method");
		
	}

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		  Demo  d1 =  ctx.getBean(Demo.class);
		  
		  System.out.println(d1.cities);
		  System.out.println(d1.students);
		  
		  ((AnnotationConfigApplicationContext)ctx).close();

	}

}
