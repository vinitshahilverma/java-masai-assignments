package com.question1;

import java.util.Scanner;


public class Main {
	
	
	public static String reverseString(String input) {
		
		   StringBuilder rev = new StringBuilder("");
		   
		   char[] chr = input.toCharArray();
		   
		   for(int i=chr.length-1; i>=0; i--) {
			   rev.append(chr[i]);
		   }
		   
		   return rev.toString();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your String");
		
		String str = sc.next();
		
        System.out.println(reverseString(str));

	}

}
