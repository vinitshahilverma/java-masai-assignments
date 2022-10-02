package com.question2;

import java.util.Scanner;

public class Main {
     
	  public static void main(String[] args) {
		  
		   Scanner sc = new Scanner(System.in);
		    
		   System.out.println("Enter the String :");
		   
		   String str = sc.nextLine();
		   
		   System.out.println("Your string is : " +str);
		   
		   System.out.println("Enter the character position you want to access :");
		      
		   int index = sc.nextInt();
		   
		   System.out.println("Character at position "+index+" is : " +str.charAt(index));
	  }
}
