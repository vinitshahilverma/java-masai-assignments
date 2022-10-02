package com.question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Start of main..");
		
		Scanner sc = new Scanner(System.in);
		
		String message = null;
		
		try {
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		int num3 = num1/num2;
		
		if(num3>10) {
			message =  "Welcome to the Exception handling";
		}
		else {
			throw new Exception();
		}

		}
	    catch(ArithmeticException ae) {
	    	
	    	message = "num2 should not be 0";
	    }
		catch(InputMismatchException ie) {
			
			message = "Please enter valid number";
		}
		catch(Exception e) {
			message = "String value is null";
		}
		
		
		System.out.println("Message is : "+ message.toUpperCase());
		System.out.println("End of main");
	}

}
