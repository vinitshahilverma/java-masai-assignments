package com.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static List<? super Child> fun(List<? super Child> list){
	
		return list;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whom details do you want to add? Father/Child");
		
		String choice = sc.next();
		
		
		
       if(choice.equals("father")) {
		System.out.println("how many details do you want to add?");
		
		List<Father> li = new ArrayList<>();
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			Father ft = new Father();
			System.out.println("Enter details "+(i+1));
			
			System.out.println("Enter name");
			ft.setName(sc.next());
			
			System.out.println("Enter age");
			ft.setAge(sc.nextInt()); 
			
			li.add(ft);
			
		}
		 System.out.println(fun(li));
  	   
       }
       else {
   		System.out.println("how many details do you want to add?");
		
   		List<Child> li = new ArrayList<>();
   		
   		int n = sc.nextInt();
   		
   		for(int i=0; i<n; i++) {
   			
   			Child ft = new Child();
   			System.out.println("Enter details "+(i+1));
   			
   			System.out.println("Enter name");
   			ft.setName(sc.next());
   			
   			System.out.println("Enter age");
   			ft.setAge(sc.nextInt()); 
   			
   			li.add(ft);
   			
   		}
   	    System.out.println(fun(li));
    	   
    	   
       }
	}

}
