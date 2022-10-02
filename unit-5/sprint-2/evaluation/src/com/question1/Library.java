package com.question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
	
	public static List<Book> b1 = new ArrayList<>();
	
	
	 void addBook(Book book)throws BookException{
		
		if(b1.contains(book)) {
			
			BookException be = new BookException("Book is Already exist.");
			
			throw be;
			
		}
		else {
			b1.add(book);
			
			System.out.println("Book added Successfully.");
		}
		
	}
	
	List<Book> viewAllBooks()throws BookException{
		
		if(b1.size()==0) {
			
			BookException be = new BookException("Library is Empty.");
			
			throw be;
		}
		else {
			Collections.sort(b1, (b1,b2)-> b1.getBookName().compareTo(b2.getBookName()));
			
			return b1;
		}
	}
	
	List<Book> viewBooksByAuthor(String Author)throws BookException{
		
		List<Book> b2 = new ArrayList<>();
		
		for(Book b:b1) {
			if(b.getAuthor().equals(Author)) {
				b2.add(b);
			}
		}
		
		if(b2.size()==0) {
			
           BookException be = new BookException("None of the book published by the author " + Author);
			
			throw be;
			
		}
		else {
			return b2;
		}
	}
	
	Book getBookByISBN(int isbn)throws BookException{
		
		 for(Book b:b1) {
			 if(b.getIsbn()==isbn) {
				 return b;
			 }
		 }
		 
			  BookException be = new BookException("No Book found with isbn "+ isbn);
				
				throw be;

		 
	}
	

}
