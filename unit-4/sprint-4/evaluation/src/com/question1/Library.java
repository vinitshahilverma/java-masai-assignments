package com.question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Library {
      
	
	public static void main(String[] args) {
		
		
		HashSet<Book> booksCollection = new HashSet<>();
		
		booksCollection.add(new Book(1,"Name1","Author1"));
		booksCollection.add(new Book(2,"Name2","Author1"));
		booksCollection.add(new Book(3,"Name1","Author1"));
		booksCollection.add(new Book(1,"Name4","Author2"));
		
		
	    List<Book> books = new ArrayList<>(booksCollection);
	    
	    
	    for(Book b:books) {
	    	
	    	System.out.println(b);
	    }
		
	}
	
}
