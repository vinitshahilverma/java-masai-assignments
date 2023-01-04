package com.useCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

         ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
         
         Collage collage = ctx.getBean("clg",Collage.class);
         
         collage.showDetail();

	}

}
