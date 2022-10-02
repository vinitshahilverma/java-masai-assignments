package com.question1;

public class ZImpl implements Z {

	@Override
	public void method1() {
		
		System.out.println("Inside the abstract method1 of ZImpl class");
	}

	@Override
	public void method4() {
		
		System.out.println("Inside the abstract method4 of ZImpl class");
	}

	@Override
	public void method7() {
		
		System.out.println("Inside the abstract method7 of ZImpl class");
	}
	
	@Override
	public void method2() {
		
		System.out.println("Inside the abstract method2 of ZImpl class");
		Z.super.method2();
	    Z.super.method5();
	}

}
