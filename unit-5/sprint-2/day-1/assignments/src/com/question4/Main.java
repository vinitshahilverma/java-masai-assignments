package com.question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			 System.out.println("Enter Number a");
			 int a = sc.nextInt();
			 
			 System.out.println("Enter Number b");
			 int b = sc.nextInt();
			 
			 int ans = a/b;
			 
			 System.out.println("The quotient of "+a+"/"+b+"="+ans);
			
		}
		catch(ArithmeticException ae) {
			
			System.out.println("DivideByZeroException caught");
			
		}
		finally {
			System.out.println("Inside finally block");
		}

	}

}
