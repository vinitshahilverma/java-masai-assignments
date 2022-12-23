package com.question2;

import java.util.Scanner;

public class Calculation {
		
	
	public static void main(String[] args) throws SomeSeriousProblemOccuredException {
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			 System.out.println("Enter first Number");
			 
			 int n = sc.nextInt();
			 
			 System.out.println("Enter Second Number");
			 
			 int y = sc.nextInt();
			 
			 System.out.println(n/y);
			
		}
		catch(Exception e) {
			  throw new SomeSeriousProblemOccuredException("Some Serious problem occurs...");
		}
		finally{
			sc.close();
		}
		
	}
	
	

}
