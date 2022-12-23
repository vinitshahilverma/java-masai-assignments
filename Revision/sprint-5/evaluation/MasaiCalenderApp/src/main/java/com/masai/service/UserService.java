package com.masai.service;

import java.util.List;

import com.masai.exception.EventException;
import com.masai.exception.UserException;
import com.masai.model.Event;
import com.masai.model.User;

public interface UserService {
	
	public User addUser(User user)throws UserException;
	
	public String loginUser(String email,String password)throws UserException;
	
	public User updateUser(User user,String email)throws UserException;
	
	public User deleteUser(String email)throws UserException;
	
	public User getUserById(String email)throws UserException;
	
	public List<Event> getEventByType(String email,String type)throws EventException,UserException;

}
