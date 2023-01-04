package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.Book;
import com.masai.exception.BookException;

@RestController
@RequestMapping("/reader")
public class readerController {
	
      List<Book> list = new ArrayList<>();
      
      public readerController() {
    	  
    	         list.add(new Book(101,"C++", "Nitesh", "Rajput Publication", "Computer Programming", 1500, 240,"G423"));
    	  
      }
      
      @GetMapping("/books")
      public ResponseEntity<List<Book>> getAllBooks(){
    	  List<Book> list2 = new ArrayList<>();
    	  
    	  for(Book b:list) {
    		  
    		  list2.add(new Book(b.getName(),b.getAuthor(),b.getPublication(),b.getCategory(),b.getPages(),b.getPrice()));
    		  
    	  }
    	  
    	  return new ResponseEntity<List<Book>>(list2,HttpStatus.OK);
    	  
      }
      
    
	@GetMapping("/books/{bookId}")
      public ResponseEntity<Book> getBookById(@PathVariable("bookId") Integer bookId) throws BookException{
    	  
    	    Book book = null;
    	    
    	    boolean flag = false;
    	    
    	    for(Book b:list) {
    	    	
    	    	if(b.getBookId()==bookId) {
    	    	  book = new Book(b.getName(),b.getAuthor(),b.getPublication(),b.getCategory(),b.getPages(),b.getPrice());
    	    		flag = true;
    	    		break;
    	    	}
    	    }
    	  
    	    
    	    if(flag==false) {
    	    	throw new BookException("Book not found...");
    	    }
    	   
    	    	return new ResponseEntity<Book>(book,HttpStatus.OK);
    	  
    	  
      }
      
}
