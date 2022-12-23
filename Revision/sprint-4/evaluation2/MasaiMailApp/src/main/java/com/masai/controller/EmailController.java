package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.service.EmailService;
import com.masai.service.UserService;

@RestController
public class EmailController {
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private EmailService eService;
	
	@PostMapping("masaimail/mail/{id}")
	public ResponseEntity<String> sendEmailHandler(@PathVariable("id")Integer id,@RequestBody Email mail
			       ,@RequestBody List<String> users) throws UserException, EmailException{
		
		String message = uService.sendMailToUser(id, mail, users);
		
	  return new ResponseEntity<String>(message,HttpStatus.OK);
		
	}
	
	@PatchMapping("masaimail/user/{uid}/mail/{mid}")
	public ResponseEntity<String> markEmailStarHandler(@PathVariable("uid")Integer uid,@PathVariable("mid")Integer mid) throws UserException, EmailException{
		
		String message = uService.starMail(uid, mid);
		
	  return new ResponseEntity<String>(message,HttpStatus.OK);
		
	}
	
	@DeleteMapping("masaimail/deleteMailFromStar/{uid}/mail/{mid}")
	public ResponseEntity<String> deleteEmailHandler(@PathVariable("uid")Integer uid,@PathVariable("mid")Integer mid) throws EmailException, UserException{
		
		String str = uService.deteleMailFromStar(uid, mid);
		
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	@DeleteMapping("masaimail/delete/{id}")
	public ResponseEntity<Email> deleteEmailHandler(@PathVariable("id")Integer id) throws EmailException{
		
		Email email = eService.deleteEmail(id);
		
		return new ResponseEntity<Email>(email,HttpStatus.OK);
	}
	
	

}
