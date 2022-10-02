package com.question2;

import java.util.Scanner;

public class Demo {
	
	
	public Hotel provideFood(int amount) {
		
		Hotel h1 = null;
		
		if(amount>=1000) {
			
			h1 = new TajHotel();
		}
		else if(amount>=200 && amount<1000) {
			
		    h1 = new RoadSideHotel();
		}
		return h1;
		
	}

	public static void main(String[] args) {
		   
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter your budget for Dinner");
		   
		   int amount = sc.nextInt();
		   
		   Demo d1 = new Demo();
		   
		   if(amount>=200) {
			   
		   Hotel hotel = d1.provideFood(amount);
		      
		     if(hotel instanceof TajHotel) {
		    	 
		    	   TajHotel taj = (TajHotel)hotel;
		           taj.chickenBiryani();
		           taj.masalaDosa();
		    	   taj.welcomeDrink();
		     }
		     else {
		    	 
		    	 RoadSideHotel road = (RoadSideHotel)hotel;
		    	 
		    	 road.chickenBiryani();
		    	 road.masalaDosa();
		    	 
		     }
		   
		   }
		   
		   else {
			   
			   System.out.println("Please Enter a valid amount");
			   
		   }
		
	}

}
