package com.question3;

public class Parent {
    
	int number;
	
	public void method1() {
	
		System.out.println("Inside method1 of Parent class");
	}
	
	private void method2() {
		System.out.println("Inside method2 of Parent class");
	}
	
     void method3() {
		System.out.println("Inside method3 of Parent class");
	}
     
    public void printMethod2() {
    	Parent p = new Parent();
    	p.method2();
    }
}
