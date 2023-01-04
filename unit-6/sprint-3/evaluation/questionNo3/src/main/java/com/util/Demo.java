package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.dao.Presentation;


public class Demo {

	public static void main(String[] args) {
		
		     ApplicationContext  ctx = new  AnnotationConfigApplicationContext(AppConfig.class);
		     
		   Presentation p1 =  ctx.getBean(Presentation.class);
		   
		   p1.insertProduct();
		   p1.GetProductWithingPriceRange();
		   p1.printAllProduct();
		   p1.serchProduct();
		   
		   ((AnnotationConfigApplicationContext)ctx).close();

	}

}
