package com.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		for(int i=0; i<4; i++) {
		   
		   System.out.println("Enter the product details of product : "+ (i+1));
		   
		   System.out.println("Enter product id:");
		   int id1 = sc.nextInt();
		   
		   System.out.println("Enter product name:");
		   String name1 = sc.next();
		   
		   System.out.println("Enter product price:");
		   double price1 = sc.nextInt();
		   
		   Product p1 = new Product(id1, name1, price1);
		   
		   list.add(p1);
		    
		   System.out.println("====================================================");
		   
		}
		   
		   
		   System.out.println("Enter your Choice");
		   System.out.println("1 for sorting the product to the product Price");
		   System.out.println("2 for sorting the product to the product Name");
		   System.out.println("3 for sorting the product to the product id");
		   
		   
		   int choice = sc.nextInt();
		   
		   if(choice==1) {
			   
			   TreeSet<Product> ts = new TreeSet<>(new ProductPriceComp());
			   
			    for(int i=0; i<list.size(); i++) {
			    	
			    	ts.add(list.get(i));
			    	
			    }
			   
			   System.out.println(ts);
			    
		   }
		   
		   
          if(choice==2) {
			   
			   TreeSet<Product> ts = new TreeSet<>(new ProductNameComp());
			   
			   for(int i=0; i<list.size(); i++) {
			    	
			    	ts.add(list.get(i));
			    	
			    }
			   
			   System.out.println(ts);
			   
		   }
          
          if(choice>=3) {
			   
			   TreeSet<Product> ts = new TreeSet<>(new ProductIdComp());
			   
			   for(int i=0; i<list.size(); i++) {
			    	
			    	ts.add(list.get(i));
			    	
			    }
			   
			   System.out.println(ts);
			   
		   }
	   }
		
	       
	       
	}


