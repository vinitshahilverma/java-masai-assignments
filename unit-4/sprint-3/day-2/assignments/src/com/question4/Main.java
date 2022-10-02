package com.question4;

public class Main {
	
	
//  Example of method overloading
	
	void fun() {
		System.out.println("Inside 0 parameterised function");
	}
	
	void fun(int i) {
		System.out.println("Inside int parameterise function");
	}
	
	public static void main(String[] args) { 
		
          Main d1 = new Main();
          
          d1.fun(10);
          
	}
	

}
