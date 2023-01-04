package com.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.service.ServiceDao;

@Controller
public class Demo {
	
	@Autowired
	private ServiceDao sd;
	
	
	public void addStudent() {
		
		Student s1 = new Student("Shahil",200);
		
		System.out.println(sd.saveStudent(s1));
		
		
	}

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Demo s1 = ctx.getBean(Demo.class);
		
		s1.addStudent();
		
	}

}
