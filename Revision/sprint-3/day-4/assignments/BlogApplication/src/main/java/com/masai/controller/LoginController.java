package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.LoginException;
import com.masai.model.Login;
import com.masai.service.LoginService;



@RestController
@RequestMapping("/app")
public class LoginController {
	
	@Autowired
	private LoginService userLogin;
	
	@PostMapping("/login")
	public ResponseEntity<String> logInCustomer(@RequestBody Login logindto) throws LoginException {
		String result = userLogin.loginAccount(logindto);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

	@PostMapping("/logout")
	public  ResponseEntity<String> logoutCustomer(@RequestParam(required = false) String key) throws LoginException {
		
		String result = userLogin.logoutAccount(key);
		
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

}
