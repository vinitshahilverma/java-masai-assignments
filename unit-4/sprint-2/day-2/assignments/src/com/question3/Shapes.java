package com.question3;

public class Shapes {
        
	 public void area(Circle circle) {
		
		   double area = 3.14*(circle.radius*circle.radius);
		   System.out.println("Area of circle is "+area);
	 }
	 
	 public void area(Rectangle rectangle) {
		 
		 double area = rectangle.length*rectangle.breadth;
		 System.out.println("Area of rectangle is "+area);
	 }
	 
	 public void area(Square square) {
		 
		 double area = square.side*square.side;
		 
		 System.out.println("Area of the square is "+area);
	 }
	
}
