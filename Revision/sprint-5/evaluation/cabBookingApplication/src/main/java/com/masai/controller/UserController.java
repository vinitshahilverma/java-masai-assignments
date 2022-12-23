package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.DriverException;
import com.masai.exception.LoginException;
import com.masai.exception.UserException;
import com.masai.model.CurrentUserSession;
import com.masai.model.Driver;
import com.masai.model.Login;
import com.masai.model.User;
import com.masai.repository.CurrentUserSessionRepo;
import com.masai.service.LoginService;
import com.masai.service.UserService;



@RestController
@RequestMapping("/masaiCab")
public class UserController {
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private CurrentUserSessionRepo cRepo;
	
	@Autowired
	private LoginService customerLogin;
	
	
	@PostMapping("/user/register")
	public ResponseEntity<User> addUserHandler(@Valid @RequestBody User user) throws UserException{
		
		User user1 = uService.addUser(user);
		
		return new ResponseEntity<User>(user1,HttpStatus.CREATED);
		
	}
	
	
	@PostMapping("/user/login")
	public ResponseEntity<String> logInUserHandler(@RequestBody Login logindto) throws LoginException {
		
		String result = customerLogin.loginAccount(logindto);
		
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
      
    @GetMapping("/user/findride")
	public ResponseEntity<List<Driver>> availableDriverHandler(@RequestParam String key) throws UserException, DriverException{
		
		     CurrentUserSession curr = cRepo.findByPrivateKey(key);
		     
		     User user = uService.findByMobileNumber(curr.getMobile());
		     
		     List<Driver> drivers = uService.getListOfAvaliableDriver(user.getId());
		     
		     return new  ResponseEntity<List<Driver>>(drivers,HttpStatus.OK);
		
	}
    
    @PutMapping("/user/book/{dId}/{x}/{y}")
    public ResponseEntity<Driver> bookDriverHandler(@RequestParam String key,
    		@PathVariable("dId") Integer dId,@PathVariable("x")Integer x,@PathVariable("y")Integer y) throws UserException, DriverException{
		
	     CurrentUserSession curr = cRepo.findByPrivateKey(key);
	     
	     User user = uService.findByMobileNumber(curr.getMobile());
	     
	     Driver driver = uService.bookDriver(user.getId(), dId, x, y);
	     
	     return new  ResponseEntity<Driver>(driver,HttpStatus.OK);
	
}
    

}
