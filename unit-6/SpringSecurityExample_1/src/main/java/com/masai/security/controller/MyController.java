package com.masai.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/masai")
public class MyController {

	@GetMapping("/home")
	public ResponseEntity<String> home(){
		
		return new ResponseEntity<String>("Welcome .. Home Page..!", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/user/home")
	public ResponseEntity<String> userHome(){
		return new ResponseEntity<String>("Welcome .. User Home..!", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/user/dashboard")
	public ResponseEntity<String> userDashboard(){
		return new ResponseEntity<String>("Welcome .. User Dashboard..!", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/admin/home")
	public ResponseEntity<String> adminHome(){
		return new ResponseEntity<String>("Welcome ..Admin Home Page..!", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/admin/dashboard")
	public ResponseEntity<String> adminDashboard(){
		return new ResponseEntity<String>("Welcome ..Admin Dashboard..!", HttpStatus.ACCEPTED);
	}
}
