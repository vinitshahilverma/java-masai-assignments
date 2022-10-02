package com.question3;

import java.util.Scanner;

public class Ticket {
	int pesa = -1;
	int ticketId;
	int price;
	static int availableTickets;
	
	public int calculateTicketCost(int noOfTickets) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the available tickets");
		
		int available = sc.nextInt();
		
		availableTickets = available;
		
		System.out.println("Enter the ticket Id");
		
		int id = sc.nextInt();
		
		this.ticketId = id;
		
		System.out.println("Enter the price");
		
	   int amount = sc.nextInt();
	   
	    this.price = amount;
	   
	   
//	      System.out.println("Enter the no of tickets");
	      
	      int num = noOfTickets;
	      
	     int number = availableTickets-num;
	     
	     if(number>=0) {
	    	System.out.println("Available tickets : " +availableTickets);
	    	System.out.println("Available tickets after booking : " +number);
	    	pesa = amount*num; 
	     }
	     
	     return pesa;
		
	}

	

}
