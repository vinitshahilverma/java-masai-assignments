package com.masai.shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class ShapeAreaCalculator {
	
	@Autowired
	@Qualifier("Rectangle")
	private Shapes shape;
	

//	public ShapeAreaCalculator(Shapes shape) {
//		// TODO Auto-generated constructor stub
//		this.shape = shape;
//	}
	
	public void invokeArea() {
		shape.area();
	}
     
	public void invokeParameter() {
		shape.parameter();
	}
}
