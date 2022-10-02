package com.question2;

public class Super extends This{
     
	Super(int roll, String name) {
		super(roll, name);
		
	}
	
	@Override
	public void fun1() {
		System.out.println("Inside fun1 of Super class");
		super.fun1();
	}

	public static void main(String[] args) {
		
           This s1 = new Super(10,"Shahil");
           s1.printDetails();
           s1.fun1();
	}

}
