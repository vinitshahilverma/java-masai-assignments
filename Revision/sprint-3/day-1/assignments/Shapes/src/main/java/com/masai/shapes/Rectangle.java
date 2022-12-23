package com.masai.shapes;

import org.springframework.stereotype.Component;

@Component(value = "Rectangle")
public class Rectangle implements Shapes{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		 System.out.println("Rectangle is drawing");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is length*breadth");
	}

	@Override
	public void parameter() {
		// TODO Auto-generated method stub
		 System.out.println("Parameter of Rectangle is 2*(length+breadth)");
	}

}
