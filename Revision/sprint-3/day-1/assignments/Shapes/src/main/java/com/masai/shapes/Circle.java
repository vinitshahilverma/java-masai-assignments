package com.masai.shapes;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shapes{

	@Override
	public void draw() {
		System.out.println("Circle is drawing");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle is 3.14*r*r");
	}

	@Override
	public void parameter() {
		// TODO Auto-generated method stub
		 System.out.println("Parameter of circle is 2*3.14*r");
	}

}
