package com.question1;

public interface X {
     
	public abstract void method1();
	
	public default void method2() {
		
		System.out.println("Inside default  method2 of interface X");
		
	}
	
	
	public static void method3() {
		
		System.out.println("Inside static method3 of interface X");   
    		
	}
	
	
}
