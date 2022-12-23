package com.masai.controller;

import java.util.List;

import javax.security.auth.login.LoginException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.Login;
import com.masai.model.User;
import com.masai.service.UserService;

@RestController
@RequestMapping("/masaifir")
public class UserController {

	@Autowired
	private UserService uService;

	@PostMapping("/user/register")
	public ResponseEntity<User> registerAUserHandler(@Valid @RequestBody User user) throws UserException {

		User user1 = uService.registerUser(user);

		return new ResponseEntity<User>(user1, HttpStatus.CREATED);

	}
    
	@PostMapping("/user/login")
	public ResponseEntity<String> loginUserHandler(@RequestBody Login login) throws LoginException {

		String message = uService.loginUser(login);

		return new ResponseEntity<String>(message, HttpStatus.OK);

	}
	
	@GetMapping("/user/fir")
	public ResponseEntity<List<FIR>> getListOfFIRsHandler(@RequestParam String key) throws UserException, FIRException {

		List<FIR> firs = uService.getAllTheListOfFIR(key);

		return new ResponseEntity<List<FIR>>(firs, HttpStatus.OK);

	}
	
	@DeleteMapping("user/fir/{firId}")
	public ResponseEntity<String> withdrawFIRHandler(@PathVariable("firId") Integer firId,@RequestParam Integer id,@RequestParam String key) throws UserException, FIRException  {

		String message = uService.withDrawFIR(firId, id, key);

		return new ResponseEntity<String>(message, HttpStatus.OK);

	}

}
