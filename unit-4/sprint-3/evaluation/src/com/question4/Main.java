package com.question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the String");
		
		String str = sc.next();
		
		System.out.println("Enter the Position");
		
		 int num = sc.nextInt();
		
		 if(num>str.length()) {
			 int num1 = num;
			 while(num1>str.length()) {
			 System.out.println("Invalid position, Please enter a valid position");
			    num1 = sc.nextInt();
			 }
			 System.out.println(str.charAt(num1));
		 }
		 else {
			 System.out.println(str.charAt(num)); 
		 }
		

	}

}
