package com.masai;

public class Test {

	public static void main(String[] args) {
		
		Demo obj1 = new Demo();
		Demo obj2 = obj1;
		
		obj1.a += 1;
		obj2.b += 1;
		
		System.out.println("values of obj1 : ");
		obj1.print();
		
		System.out.println("values of obj2 : ");
		obj2.print();
	}

}
