package com.question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of Bookings");
		
		int nums = sc.nextInt();
		
		for(int i=1; i<nums; i++) {
			
			System.out.println("Enter the no of tickets");
			
			int no = sc.nextInt();
			
			Ticket ticket = new Ticket();
			
		System.out.println("Total Amount : " +ticket.calculateTicketCost(no));	
			
			
		}
	}

}
