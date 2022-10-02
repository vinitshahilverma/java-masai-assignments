package com.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the number");
			
			String str = sc.next();
			
			int num = Integer.parseInt(str);

			System.out.println(num*num);
			
		}
		catch (NumberFormatException nme) {
			
			System.out.println("Entered input is not valid format for an integer");
			
		}

		System.out.println("The work has beeen done successfully");
		
	}

}
