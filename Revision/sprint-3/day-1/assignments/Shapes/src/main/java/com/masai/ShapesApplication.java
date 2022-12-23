package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.masai.shapes.Circle;
import com.masai.shapes.ShapeAreaCalculator;
import com.masai.shapes.ShapeDrawer;

@SpringBootApplication
public class ShapesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ShapesApplication.class, args);
		
	
		
		ShapeDrawer sd = context.getBean(ShapeDrawer.class);
		
		  sd.invokeDraw();
		  
		  
		ShapeAreaCalculator sac = context.getBean(ShapeAreaCalculator.class);
		
		sac.invokeArea();
		sac.invokeParameter();
		

	}

}
