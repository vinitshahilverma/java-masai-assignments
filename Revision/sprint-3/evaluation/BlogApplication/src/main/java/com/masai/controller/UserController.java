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
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.PostExcepiton;
import com.masai.exception.UserException;
import com.masai.model.Post;
import com.masai.model.User;
import com.masai.service.UserService;



@RestController
public class UserController {
	
	@Autowired
	private UserService uService;
	
	@GetMapping("/Users/{id}/Posts")
	public ResponseEntity<List<Post>> getAllPostsByUserIdHandler(@PathVariable("id")Integer id) throws UserException, PostExcepiton{
		
		List<Post> list = uService.getAllPostsByUserId(id);
		
		return new ResponseEntity<List<Post>>(list,HttpStatus.OK);
		
	}
   
    @GetMapping("/User/{id}")
     public ResponseEntity<User> getUserIdHandler(@PathVariable("id")Integer id) throws UserException{

		User list = uService.getUserById(id);
		
		return new ResponseEntity<User>(list,HttpStatus.OK);		
	}
    
    @DeleteMapping("/User/{id}")
    public ResponseEntity<User> DeleteUserIdHandler(@PathVariable("id")Integer id) throws UserException{

		User list = uService.deleteUser(id);
		
		return new ResponseEntity<User>(list,HttpStatus.OK);		
	}
    
    @PutMapping("/User/{id}")
    public ResponseEntity<User> UpdateUserIdHandler(@Valid @PathVariable("id")Integer id,@RequestBody User user) throws UserException{

  		User list = uService.updateUser(id, user);
  		
  		return new ResponseEntity<User>(list,HttpStatus.OK);		
  	}
    
    @PostMapping("/User")
    public ResponseEntity<User> UpdateUserIdHandler(@Valid @RequestBody User user) throws UserException{

  		User list = uService.addUser(user);
  		
  		return new ResponseEntity<User>(list,HttpStatus.OK);		
  	}

}
