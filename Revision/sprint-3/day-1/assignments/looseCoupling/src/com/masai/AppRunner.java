package com.masai;

public class AppRunner {

	public static void main(String[] args) {
		
		Shapes shape = new Circle();
		
		ShapeDrawer sd = new ShapeDrawer(shape);
		
		sd.invokeDraw();

		ShapeAreaCalculator sac = new ShapeAreaCalculator(shape);
		
		sac.invokeArea();
		sac.invokeParameter();

	}

}
