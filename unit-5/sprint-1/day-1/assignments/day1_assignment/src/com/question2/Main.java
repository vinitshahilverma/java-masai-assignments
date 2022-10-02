package com.question2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Queue<Product> qe = new PriorityQueue<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Products do you want to add?");
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
	
			System.out.println("Enter details of product "+(i+1));
			
			System.out.println("Enter productId");
			int id = sc.nextInt();
			
			System.out.println("Enter product Name");
			String name = sc.next();
			
			System.out.println("Enter product Price");
			double price = sc.nextDouble();
			
			Product p1 = new Product(id,name,price);
			
			qe.offer(p1);

		}
		
		 Iterator<Product> itr = qe.iterator();
		 
		while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		
		
	    while(qe.size()!=0) {
			System.out.println(qe.poll());
		}

	}

}
