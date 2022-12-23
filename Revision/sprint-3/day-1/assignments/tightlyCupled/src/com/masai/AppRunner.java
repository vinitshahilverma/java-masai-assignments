package com.masai;

public class AppRunner {

	public static void main(String[] args) {
	   
		 Circle circle = new Circle();
		 
		 ShapeAreaCalculator sac = new ShapeAreaCalculator();
		 
		 sac.invokeAreaCalcuation(circle);
		 sac.invokeParameterCalculation(circle);
		 
		 //To call these methods for square and rectangle we have change the reference for the
		 // shapes also we have change shapes in ShapeAreaCalculator class.
		 
		 
		 ShapeDrawer sd = new ShapeDrawer();
		 
		 sd.invokeDraw(circle);
		 
		 //To call these methods for square and rectangle we have change the reference for the
		 // shapes also we have change shapes in ShapeDrawer class.So this is a example of tight coupling
	}

}
