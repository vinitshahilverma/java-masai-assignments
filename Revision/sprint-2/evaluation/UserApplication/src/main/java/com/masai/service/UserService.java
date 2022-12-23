package com.masai.service;

import java.util.List;

import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;

public interface UserService {
	
	 public List<User> getAllUser()throws UserException;
	 
	 public User createUser(User user)throws UserException;
	 
	 public User getUserById(Integer id)throws UserException;
	 
	 public User deleteUser(Integer id)throws UserException;
	  
	 public Email getDetailsOfEmail(Integer uid,Integer mid)throws UserException,EmailException;
	  
	 public User createEmailForuser(Integer id,Email email) throws UserException,EmailException;

}
