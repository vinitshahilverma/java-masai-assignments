package com.masai.dao;

import java.util.List;

import com.masai.bean.Book;
import com.masai.exception.BookException;

public interface BookDao {
	
	public String addBook(Book book);
	
	public List<Book> getAllBooks();

	public Book getBookById(Integer Id);
	
	public Book updateBook(Book book);
	
	public Book deleteBookById(Integer Id);

}
