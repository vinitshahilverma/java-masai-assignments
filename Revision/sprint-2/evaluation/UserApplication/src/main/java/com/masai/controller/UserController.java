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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.service.UserService;



@RestController
public class UserController {

	@Autowired
	private UserService uService;

	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUserHandler() throws UserException {

		List<User> list = uService.getAllUser();

		return new ResponseEntity<List<User>>(list, HttpStatus.OK);

	}
    
	@PostMapping("/users")
	public ResponseEntity<User> createUserHandler(@RequestBody User user) throws UserException {

	      User user1 = uService.createUser(user);

		return new ResponseEntity<User>(user1, HttpStatus.CREATED);

	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserByIdHandler(@PathVariable("id") Integer id) throws UserException {

	      User user = uService.getUserById(id);

		return new ResponseEntity<User>(user, HttpStatus.OK);

	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<User> deleteUserByIdHandler(@PathVariable("id") Integer id) throws UserException {

	      User user = uService.deleteUser(id);

		return new ResponseEntity<User>(user, HttpStatus.OK);

	}
	
	@GetMapping("users/{id}/mail/{mail_id}")
	public ResponseEntity<Email> getEmailDetailsHandler(@PathVariable("id")Integer id,@PathVariable("mail_id")Integer mail_id) throws UserException, EmailException {

	      Email email = uService.getDetailsOfEmail(id, mail_id);

		return new ResponseEntity<Email>(email, HttpStatus.ACCEPTED);

	}
	
	@PostMapping("user/{id}/mail")
	public ResponseEntity<User> createEmailForUserHandler(@RequestBody Email mail,@PathVariable("id") Integer id) throws UserException, EmailException {

	      User user = uService.createEmailForuser(id, mail);

		return new ResponseEntity<User>(user, HttpStatus.CREATED);

	}
	

}
