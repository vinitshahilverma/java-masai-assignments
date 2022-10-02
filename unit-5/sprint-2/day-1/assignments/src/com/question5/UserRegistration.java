package com.question5;

import java.util.Scanner;

public class UserRegistration {
	
	
	public static void registerUser(String userName,String userCountry)throws InvalidCountryException {
		
		if(userCountry.equalsIgnoreCase("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			InvalidCountryException ie = new InvalidCountryException("User Outside India cannot be registered");		
			throw ie;
		}
		
		
	}

	public static void main(String[] args) {
		
           try {
        	   
        	   Scanner sc = new Scanner(System.in);
        	   
        	   System.out.println("Enter your Name");
        	   String name = sc.next();
        	   
        	   System.out.println("Enter your Country");
        	   String country = sc.next();
        
        	   registerUser(name,country);
        	   
           }
           catch(InvalidCountryException e) {
        	   
        	      System.out.println(e.getMessage());
        	   
           }
           
           System.out.println("Thank you!");
	}

}
