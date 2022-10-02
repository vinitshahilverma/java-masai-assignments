package com.question2;

import java.util.Scanner;

public class IPL {
	
	public static void homeTeamStadium(Stadium stadium) {
		
		  if(stadium!=null) {
			  
			  stadium.message();
		  }
		  else {
			System.out.println("Enter valid Stadium");
		  }
		
	}
	
	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter Stadium Name ex-Eaden_garden_Stadium");
		   
		   String str = sc.next();
		   
		   
		   
		   try {
			   Stadium stadium = Stadium.valueOf(str.toUpperCase());
		   homeTeamStadium(stadium);
		   
		   }
		   catch (Exception e) {
			System.out.println("Invalid type");
		}
		   
	}

}
