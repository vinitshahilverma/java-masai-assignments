package com.masai;

public class A extends B{
	
	public static String sing() {
		return "fa";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		B b = new B();
		
		System.out.println( a.sing()+" "+b.sing() );

	}

}
