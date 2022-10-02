package com.question3;

import java.util.Scanner;

final class Child extends Parent {
       
	 @Override
	public void method1() {
		 System.out.println("Number is : " +super.number);
		 System.out.println("Inside method1 of Child class"); 
	}
	 
   void method4() {
	   System.out.println("Inside method4 of Child class");
   }
   
   
   public static void main(String[] args ) {
	     
	    Scanner sc = new Scanner(System.in);
	     
	    
	      
	    System.out.println("Enter a number");
	    
	     int num = sc.nextInt();
	     
	     if(num>=1 && num<=10) {
	    	 Child ch = new Child();
	    	 ch.number = num;
	    	 ch.method1();
	     }
	     else {
	    	 System.out.println("Invalid Number");
	     }
	     
	     Parent p = new Parent();
	     p.method1();
	     p.printMethod2();
	     p.method3();
	      p = new Child();
	     Child ch1 = (Child)p;
	     ch1.method4();
   }
}
