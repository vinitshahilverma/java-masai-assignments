package com.question4;

// Example of Overriding
public class Overriding extends A{
	
	@Override
	public void funA() {
	  
		System.out.println("Inside function of class Overriding");
	}
	

	public static void main(String[] args) {
		
		 A a = new A();	 
		 a.funA();
		 	 
		
	}

}
