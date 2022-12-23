package com.masai.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.masai.exception.BookException;
import com.masai.model.Book;
import com.masai.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepo bRepo;
		
	@Override
	public List<Book> getAllBook() throws BookException { 
		
		  List<Book> list = bRepo.findAll();
		  
		  if(list.size()==0) {
			  throw new BookException("No Book found");
		  }
		  
		  return list;
	  
	}

	@Override
	public Book getBookById(Integer id) throws BookException {
		
		Book book = bRepo.findById(id)
				         .orElseThrow(() -> new BookException("No Book found"));
		
		Book b1 = bRepo.save(book);
		
		return b1;
		
	}

	@Override
	public Book addBook(Book book)throws BookException{
		
		if(book!=null) {
			Book b1 = bRepo.save(book);
			return b1;
		}
		else {
			 throw new BookException("Book is null...");
		}
		
	}

	@Override
	public Book deleteBook(Integer id) throws BookException {
		
		Book book = bRepo.findById(id)
		         .orElseThrow(() -> new BookException("No Book found"));
		
		bRepo.delete(book);
		
		return book;
		
	}

	@Override
	public Book updateBook(Book book,Integer id) throws BookException {
		
		Book book1 = bRepo.findById(book.getBookId())
		         .orElseThrow(() -> new BookException("No Book found"));
		
		book1 = bRepo.save(book);
		
		return book1;
		
	}
	
	

}
