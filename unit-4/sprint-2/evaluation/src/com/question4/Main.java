package com.question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    String purpose = sc.next();
	    
	    Laptop gamingLaptop = getLaptop(purpose);
	     
	    
	    gamingLaptop.displayDetails();

	}
	
	public static Laptop getLaptop(String laptopPurpose) {
		
	
	   Laptop laptop = new Laptop();
	    
	   
	    	   laptop.setPurpose(laptopPurpose);   
	      
	      return laptop;
	   	
	}
     
	
}
