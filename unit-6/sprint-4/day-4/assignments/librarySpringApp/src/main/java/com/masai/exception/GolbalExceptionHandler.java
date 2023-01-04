package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.masai.bean.MyErrorDetails;

@ControllerAdvice
public class GolbalExceptionHandler {
	
	@ExceptionHandler(BookException.class)
	public ResponseEntity<MyErrorDetails> bookExceptionHandler(BookException be,WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails();
		
		err.setDetails(req.getDescription(false));
		err.setMessage(be.getMessage());
		err.setTimeStamp(LocalDateTime.now());
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exceptionHandler(Exception ie,WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails();
		
		err.setDetails(req.getDescription(false));
		err.setMessage(ie.getMessage());
		err.setTimeStamp(LocalDateTime.now());
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> noHandlerExceptionHandler(NoHandlerFoundException nfe,WebRequest req){
		
		
		MyErrorDetails err = new MyErrorDetails();
		
		err.setDetails(req.getDescription(false));
		err.setMessage(nfe.getMessage());
		err.setTimeStamp(LocalDateTime.now());
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	

}
