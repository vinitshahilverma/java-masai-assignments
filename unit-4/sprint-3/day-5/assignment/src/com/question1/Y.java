package com.question1;

public interface Y {
        
	public abstract void method4();
	
    public default void method5() {
    	
    	System.out.println("Inside default  method5 of interface Y");
    	
    }
    
    public static void method6() {
    	
    	System.out.println("Inside static method6 of interface Y");   
    	
    }
}
