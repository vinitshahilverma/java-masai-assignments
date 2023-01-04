package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.Book;
import com.masai.exception.BookException;
import com.masai.service.BookService;

@RestController
@RequestMapping("/library")
public class BookController {
	
	@Autowired
	BookService bs;
	
	@PostMapping("/book")
	public ResponseEntity<String> createBook(@RequestBody Book book){
		
		  bs.addBook(book);
		  
		  
		return new ResponseEntity<String>("Book added Successfully..",HttpStatus.ACCEPTED);
		
	}
	
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() throws BookException{
		
		 List<Book> list = bs.getAllBooks();
		 
		 if(list.size()==0) {
			 throw new BookException("Library is empty....");
		 }
		 
		 return new  ResponseEntity<List<Book>>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/book/{bookId}")
	public ResponseEntity<Book> getBookById(@PathVariable("bookId")Integer bookId) throws BookException{
		  
		 Book book = bs.getBookById(bookId);
		 
		 if(book==null) {
			 throw new BookException("Book Not found....");
		 }
		
		 return new  ResponseEntity<Book>(book,HttpStatus.OK);
	}
	
	@PutMapping("/book")
	public ResponseEntity<Book> updateBook(@RequestBody Book book) throws BookException{
		
		Book book1 = bs.updateBook(book);
		
		 if(book==null) {
			 throw new BookException("Book Not found....");
		 }
		
		 return new  ResponseEntity<Book>(book,HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<Book> updateBook(@PathVariable("bookId") Integer bookId) throws BookException{
		
		Book book = bs.deleteBookById(bookId);
		
		 if(book==null) {
			 throw new BookException("Book Not found....");
		 }
		
		 return new  ResponseEntity<Book>(book,HttpStatus.OK);
		
	}

}
