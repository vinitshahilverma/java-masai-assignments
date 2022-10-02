package com.question2;

import java.util.Scanner;

public class Average {
	
	public static int calculateAverage(int[] age) {
		
		int avg =0;
		int sum=0;
		for(int i=0; i<age.length; i++) {
			sum=sum+age[i];
		}
		
		double average = sum/age.length;
	
		return (int)average;
		
	}

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the no.Of employees");
         
         int num = sc.nextInt();
         
         if(num>1) {
        	 int[] arr = new int[num];
        	   
        	 System.out.println("Enter the age Of "+ num +" employees");
        	   for(int i=0; i<arr.length; i++) {
        		   sc.nextLine();
        		   arr[i]=sc.nextInt();
        	   }
        	   
        	   double average = calculateAverage(arr);
        	   
        	 System.out.println("The average age is " +average); 
         }
         else {
        	 System.out.println("Please enter a valid employee count");
         }
	}

}
