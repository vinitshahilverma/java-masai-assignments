package com.masai;

import java.util.ArrayList;
import java.util.List;

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

@RestController
@RequestMapping("/author")
public class authorController {

	private List<Book> books = new ArrayList<>();

	public authorController() {

		books.add(new Book(101, "C++", "Nitesh", "Rajput Publication", "Computer Programming", 1500, 240, "G452"));
	}

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() {

		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);

	}

	@GetMapping("/books/{bookId}")
	public ResponseEntity<Book> getBookById(@PathVariable("bookId") Integer bookId) throws BookException {

		Book book = null;

		boolean flag = false;

		for (Book b : books) {
			if (b.getBookId() == bookId) {
				book = b;
				flag = true;
				break;
			}
		}

		if (flag == false) {
			throw new BookException("Book not found");
		}
		return new ResponseEntity<Book>(book, HttpStatus.OK);

	}
	
	@PostMapping("/books")
	public ResponseEntity<String> createBook(@RequestBody Book book){
		
		books.add(book);

		return new ResponseEntity<String>("Book added successfully...",HttpStatus.CREATED);
	}
	
	@PutMapping("/books/{bookId}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book,@PathVariable("bookId") Integer bookId) throws BookException{
		
		  boolean flag = false;
		  
		  for(Book b:books) {
			  
			  if(b.getBookId()==bookId) {
				   b.setPrice(book.getPrice());
				   b.setName(book.getName());
				   b.setAuthor(book.getAuthor());
				   b.setAuthor_no(book.getAuthor_no());
				   b.setCategory(book.getCategory());
				   b.setPublication(book.getPublication());
				   b.setPages(book.getPages());
				   flag = true;
				   break;
			  }
			  		  
		  }
		  
		  if(flag==false) {
			  throw new BookException("Book not found...");
		  }
		  
		  return new ResponseEntity<Book>(book,HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/books/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable("bookId") Integer bookId) throws BookException{
		
		boolean flag = books.removeIf(b -> b.getBookId()==bookId);
		
		if(flag==true) {
			return new ResponseEntity<String>("book deleted successfully...",HttpStatus.ACCEPTED);
		}
		else {
			throw new BookException("Book not found...");
		}
		
	}
	
	
}
