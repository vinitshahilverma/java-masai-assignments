package com.question1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
	
		 ArrayList<String> str = new ArrayList<>();
		 
		 str.add("apple");
		 str.add("mango");
		 str.add("papaya");
		 str.add("banana");
		 str.add("orange");
		 str.add("kiwi");
		 
		 System.out.println(str);
		 
		 System.out.println("========================Using ForLoop=========================");
		 
		 for(int i=0; i<str.size(); i++) {
			 System.out.println(str.get(i)+" ");
		 }
		
		 System.out.println("====================Using enhanced For loop=====================");
		 
		 for(String i:str) { 
			 System.out.println(i);
		 }
		 
		 System.out.println("===========================Iterator=========================");
		 
		 Iterator<String> it = str.iterator();
		 
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }

	}

}
