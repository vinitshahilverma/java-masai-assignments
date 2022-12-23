package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmailException;
import com.masai.exception.LoginException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.Login;
import com.masai.model.User;
import com.masai.service.EmailService;
import com.masai.service.LoginService;
import com.masai.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService uService;

	@Autowired
	private EmailService eService;

	@Autowired
	private LoginService userLogin;

	@PostMapping("/masaimail/register")
	public ResponseEntity<User> registerUserHandler(@Valid @RequestBody User user) throws UserException {

		User user1 = uService.addUser(user);

		return new ResponseEntity<User>(user1, HttpStatus.CREATED);
	}

	@GetMapping("/masaimail/mail/{id}")
	public ResponseEntity<List<Email>> getAllMailHandler(@PathVariable("id") Integer id) throws UserException {

		List<Email> email = uService.getAllMails(id);

		return new ResponseEntity<List<Email>>(email, HttpStatus.OK);

	}

	@GetMapping("/masaimail/starred/{id}")
	public ResponseEntity<List<Email>> getAllStartedMailHandler(@PathVariable("id") Integer id) throws UserException {

		List<Email> email = uService.getAllStartedMails(id);

		return new ResponseEntity<List<Email>>(email, HttpStatus.OK);
	}

	@PutMapping("/masaimail/user/{id}")
	public ResponseEntity<User> updateHandler(@Valid @RequestBody User user, @PathVariable("id") Integer id)
			throws UserException {

		User user1 = uService.updateUser(id, user);

		return new ResponseEntity<User>(user1, HttpStatus.OK);
	}

	@PostMapping("masaimail/login")
	public ResponseEntity<String> logInCustomer(@RequestBody Login logindto) throws LoginException {
		String result = userLogin.loginAccount(logindto);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

	@PostMapping("masaimail/logout")
	public ResponseEntity<String> logoutCustomer(@RequestParam(required = false) String key) throws LoginException {

		String result = userLogin.logoutAccount(key);

		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

	@DeleteMapping("/masaimail/deletemailfromRecieve/{uid}/{eid}")
	public ResponseEntity<String> deleteMailfromSendAndRecieve(@PathVariable("uid") Integer uid,
			@PathVariable("mid") Integer mid) throws EmailException, UserException {

		String result = uService.deteleMail(uid, mid);

		return new ResponseEntity<String>(result, HttpStatus.OK);

	}

	@DeleteMapping("/masaiMail/{id}")
	public ResponseEntity<User> deleteUserHandler(@PathVariable("id") Integer id) throws UserException {

		User user1 = uService.deleteUser(id);

		return new ResponseEntity<User>(user1, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/masaiMail/{id}")
	public ResponseEntity<User> getUserByIdHandler(@PathVariable("id") Integer id) throws UserException {

		User user1 = uService.getUserById(id);

		return new ResponseEntity<User>(user1, HttpStatus.CREATED);
	}
	

}
