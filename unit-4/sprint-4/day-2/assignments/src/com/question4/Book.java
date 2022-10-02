package com.question4;

public class Book {
     
	private int isbn;
	private String bookName;
	private String author;
	
	public Book(){
		
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + "]";
	}

	public Book(int isbn, String name, String author) {
		
		this.isbn = isbn;
		this.bookName  = name;
		this.author = author;
		
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	 
}
