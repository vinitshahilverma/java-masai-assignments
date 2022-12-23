package com.question2;

import java.util.Scanner;

public class tryCalculation {

	public static void main(String[] args) {
				
		try (Scanner sc = new Scanner(System.in)){
			
			 System.out.println("Enter first Number");
			 
			 int n = sc.nextInt();
			 
			 System.out.println("Enter Second Number");
			 
			 int y = sc.nextInt();
			 
			 System.out.println(n/y);
			
		}
		

	}

}
