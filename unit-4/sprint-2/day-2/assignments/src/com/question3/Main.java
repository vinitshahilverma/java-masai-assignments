package com.question3;

public class Main {

	public static void main(String[] args) {
		Shapes shapes = new Shapes();
		
		Circle circle = new Circle();
		  
		     circle.radius = 2;
		     
		    shapes.area(circle);
		    
		    
		 Rectangle rectangle = new Rectangle();
		 
		      rectangle.breadth = 4;
		      rectangle.length = 6;
		      
		      shapes.area(rectangle);
		      
		      
		  Square square = new Square();
		    
		    square.side = 5;
		    
		    shapes.area(square);
		    
	    
	}
	
//	 In static Polymorphism a class has multiple methods with the same name but different parameters, similarly in this example we can see 
//	 Class Shapes has three methods with the same name "area" but each method have different parameters as input.

}
