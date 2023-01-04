package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Demo {

	public static void main(String[] args) {
		
	    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	    
	       StudentService  service = ctx.getBean(StudentService.class);
	       
	       service.printMap();
	       
	       service.printList();
	       
	       service.printAppName();

	}

}
