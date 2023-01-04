package com.config;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.control.StudentService;

public class Demo {
	
	public static void main(String[] args) {
		
		System.out.println("start of app");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		StudentService ss = ctx.getBean("studentService",StudentService.class);
		
		ss.addStudent();
//		Connection conn = ctx.getBean("conn",Connection.class);
//		
//		System.out.println(conn);
//		
		
	}
	
	
	
}
