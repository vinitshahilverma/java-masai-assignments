package com.masai.shapes;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shapes{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		 System.out.println("square is drawing");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		 System.out.println("Area of square is side*side");
	}

	@Override
	public void parameter() {
		// TODO Auto-generated method stub
		 System.out.println("Parameter of square is 4*side");
	}

}
