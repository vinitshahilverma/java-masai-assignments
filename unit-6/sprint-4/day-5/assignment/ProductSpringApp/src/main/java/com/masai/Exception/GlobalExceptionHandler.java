package com.masai.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.masai.model.MyErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler {
	  
	  @ExceptionHandler(ProductException.class)
	  public ResponseEntity<MyErrorDetails> productExceptionHandler(ProductException pe,WebRequest req){
		  
		  MyErrorDetails err = new MyErrorDetails();
		  
		  err.setTimeStamp(LocalDateTime.now());
		  err.setDetails(req.getDescription(false));
		  err.setMessage(pe.getMessage());
		  
		  return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	  }
	  
	  @ExceptionHandler(Exception.class)
	  public ResponseEntity<MyErrorDetails> productExceptionHandler(Exception pe,WebRequest req){
		  
		  MyErrorDetails err = new MyErrorDetails();
		  
		  err.setTimeStamp(LocalDateTime.now());
		  err.setDetails(req.getDescription(false));
		  err.setMessage(pe.getMessage());
		  
		  return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	  }
	  
	  
	  @ExceptionHandler(NoHandlerFoundException.class)
	  public ResponseEntity<MyErrorDetails> productExceptionHandler(NoHandlerFoundException pe,WebRequest req){
		  
		  MyErrorDetails err = new MyErrorDetails();
		  
		  err.setTimeStamp(LocalDateTime.now());
		  err.setDetails(req.getDescription(false));
		  err.setMessage(pe.getMessage());
		  
		  return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	  }
	  
	  
	  @ExceptionHandler(MethodArgumentNotValidException.class)
	  public ResponseEntity<MyErrorDetails> productExceptionHandler(MethodArgumentNotValidException pe){
		  
		  MyErrorDetails err = new MyErrorDetails();
		  
		  err.setTimeStamp(LocalDateTime.now());
		  err.setDetails(pe.getBindingResult().getFieldError().getDefaultMessage());
		  err.setMessage("Validation Error");
		  
		  return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	  }
	  
	  

}
