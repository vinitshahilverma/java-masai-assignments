package com.ambula.service;

import java.util.List;

import org.apache.catalina.User;

import com.ambula.exception.UserException;
import com.ambula.model.user_location;

public interface userService {
   
	public user_location createUser(user_location user)throws UserException;
	
	public user_location updateUser(user_location user)throws UserException;
	
	public List<user_location> getAllUser()throws UserException;
	
	public List<user_location> getUserByLocation(int n,int lat,int log)throws UserException;
	
    public user_location getUserByUserId(int id)throws UserException;
    
	
}
