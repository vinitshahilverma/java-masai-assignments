package com.ambula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ambula.exception.UserException;
import com.ambula.model.user_location;
import com.ambula.service.userService;

@RestController
public class userController {

	@Autowired
	private userService uService;

	@PostMapping("ambula/create_data")
	public ResponseEntity<user_location> createDataHandler(@RequestBody user_location user) throws UserException {

		user_location newUser = uService.createUser(user);

		return new ResponseEntity<user_location>(newUser, HttpStatus.CREATED);

	}

	@PatchMapping("ambula/upadate_data")
	public ResponseEntity<user_location> updateDataHandler(@RequestBody user_location user) throws UserException {

		user_location newUser = uService.updateUser(user);

		return new ResponseEntity<user_location>(newUser, HttpStatus.CREATED);

	}

	@GetMapping("ambula/get_users/{N}")
	public ResponseEntity<List<user_location>> getUserByLocationHandler(@PathVariable Integer N,
			@RequestParam Integer lat, @RequestParam Integer log) throws UserException {

		List<user_location> list = uService.getUserByLocation(N, lat, log);

		return new ResponseEntity<List<user_location>>(list, HttpStatus.ACCEPTED);

	}

    @GetMapping("ambula/getAllData")	
	public ResponseEntity<List<user_location>> getAllDataHandler() throws UserException {

		List<user_location> list = uService.getAllUser();

		return new ResponseEntity<List<user_location>>(list, HttpStatus.ACCEPTED);

	}
    
    @GetMapping("ambula/getUserById/{id}")
    public ResponseEntity<user_location> getUserByIdHander(@PathVariable Integer id) throws UserException{
    	
    	user_location user = uService.getUserByUserId(id);
    	
    	return new ResponseEntity<user_location>(user, HttpStatus.OK);
    }
    

}
