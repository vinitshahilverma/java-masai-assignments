package com.masai.service;

import java.util.List;

import com.masai.exception.DriverException;
import com.masai.exception.UserException;
import com.masai.model.Driver;
import com.masai.model.User;

public interface UserService {
	
	public User addUser(User user)throws UserException;
	
	public User findByMobileNumber(Long mobile)throws UserException;
	
	public List<Driver> getListOfAvaliableDriver(Integer id)throws UserException,DriverException;
	
	public Driver bookDriver(Integer uId,Integer dId,Integer x,Integer y)throws UserException,DriverException;

}
