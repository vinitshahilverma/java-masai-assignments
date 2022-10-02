package com.question3;

public class Area extends Shape {

	@Override
	public int rectancleArea(int length, int breadth) {
		
		int area = length*breadth;
		
		return area;
	}

	@Override
	public int squareArea(int side) {
		
       int area = side*side;
		
		return area;
	}

	@Override
	public int circleArea(int radius) {
		
		double area = 3.14*radius*radius;
		
		return (int)area;
	}
     
}
