package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.BookException;
import com.masai.model.Book;
import com.masai.service.BookService;


@RestController
@RequestMapping("/bookService")
public class BookController {
	
	@Autowired
	private BookService bService;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBookHandler() throws BookException{
		
		  List<Book> list = bService.getAllBook();
		  
		  return new ResponseEntity<List<Book>>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookbyIdHandler(@PathVariable("id")Integer id) throws BookException{
		
		  Book b1 = bService.getBookById(id);
		  
		  return new ResponseEntity<Book>(b1,HttpStatus.OK);
		
	}
	
	@PostMapping("/books")
	public ResponseEntity<Book> AddBookHandler(@RequestBody Book book) throws BookException{
		
		  Book b1 = bService.addBook(book);
		  
		  return new ResponseEntity<Book>(b1,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Book> DeleteBookHandler(@PathVariable("id")Integer id) throws BookException{
		
		  Book b1 = bService.deleteBook(id);
		  
		  return new ResponseEntity<Book>(b1,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/books/{id}")
	public ResponseEntity<Book> UpdateBookHandler(@RequestBody Book book,@PathVariable("id")Integer id) throws BookException{
		
		  Book b1 = bService.updateBook(book, id);
		  
		  return new ResponseEntity<Book>(b1,HttpStatus.ACCEPTED);
		
	}

}
