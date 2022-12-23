package com.masai.service;

import java.util.List;

import javax.security.auth.login.LoginException;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.Login;
import com.masai.model.User;

public interface UserService {
	
	public User registerUser(User user)throws UserException;
	
	public String loginUser(Login login)throws LoginException;
	
	public List<FIR> getAllTheListOfFIR(String key)throws UserException,FIRException;
	
	public String withDrawFIR(Integer firId,Integer id, String key)throws UserException,FIRException;
	
	
}
