package com.question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library{
	
	List<Book> bookList = new ArrayList<>();
	
	void addBook(Book book) {
	  
		  bookList.add(book);
		  
		  System.out.println("Book added successfully");
	}
	
	
	public boolean isEmpty(){
		
		boolean ans = bookList.isEmpty();
		
		return ans;
	}
	
	List<Book> viewAllBooks(){
		
		return bookList;
		
	}
	
	List<Book> viewBooksByAuthor(String Author){
		
		List<Book> newBook = new ArrayList<>(); 
		
		for(int i = 0 ; i<bookList.size(); i++) {
			Book b1 = new Book();
			   if(bookList.get(i).getAuthor().equals(Author)) {
				  b1.setAuthor(bookList.get(i).getAuthor()); 
				  b1.setBookName(bookList.get(i).getBookName());
				  b1.setIsbn(bookList.get(i).getIsbn());
				  
				 newBook.add(b1);
			 }
			 
		}
		return newBook; 
	}
	
	int countNoOfBook(String bookName) {
		
		int count = 0;
		
		for(int i = 0 ; i<bookList.size(); i++) {
			if(bookList.get(i).getBookName().equals(bookName)) {
				count++;
			}
		}
		return count;
	}
	

}
