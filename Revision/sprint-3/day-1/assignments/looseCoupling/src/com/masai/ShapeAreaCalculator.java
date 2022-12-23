package com.masai;

public class ShapeAreaCalculator {
	
	Shapes shape;
	
	public ShapeAreaCalculator(Shapes shape) {
		// TODO Auto-generated constructor stub
		this.shape = shape;
	}
	
	void invokeArea() {
		shape.area();
	}
     
	void invokeParameter() {
		shape.parameter();
	}
}
