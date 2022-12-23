package com.masai.service;

import java.util.List;

import com.masai.exception.BookException;
import com.masai.model.Book;

public interface BookService {
	
	public List<Book> getAllBook()throws BookException;
	
	public Book getBookById(Integer id)throws BookException;
	
	public Book addBook(Book book)throws BookException;
	
	public Book deleteBook(Integer id)throws BookException;
	
	public Book updateBook(Book book,Integer Id)throws BookException;

}
