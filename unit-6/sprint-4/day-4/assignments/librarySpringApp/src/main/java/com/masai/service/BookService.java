package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.bean.Book;
import com.masai.dao.BookDao;
import com.masai.dao.BookDaoImpl;

@Service
public class BookService {
	
	@Autowired
	BookDao dao;
	
	public String addBook(Book book) {
		
		 dao = new BookDaoImpl();
		 
		 String msg = dao.addBook(book);
		 
		 return msg;
		
	}
	
	public List<Book> getAllBooks(){
		
		dao = new BookDaoImpl();
		
		List<Book> list = dao.getAllBooks();
		
		return list;
		
	}
	
	public Book getBookById(Integer Id) {
		
		dao = new BookDaoImpl();
		
		Book book = dao.getBookById(Id);
		
		return book;
		
	}
	
	public Book updateBook(Book book) {
		
		dao = new BookDaoImpl();
		
		Book book1  = dao.updateBook(book);
		
		return book1;
	}
	
	public Book deleteBookById(Integer Id) {
		
		dao = new BookDaoImpl();
		
		Book book1 = dao.deleteBookById(Id);
		
		return book1;
		
	}
	

}
