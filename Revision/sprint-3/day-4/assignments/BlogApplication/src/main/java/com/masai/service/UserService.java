package com.masai.service;

import java.util.List;

import com.masai.exception.PostExcepiton;
import com.masai.exception.UserException;
import com.masai.model.Post;
import com.masai.model.User;

public interface UserService {
	
	public List<Post> getAllPostsByUserId(Integer id)throws UserException,PostExcepiton;
	
	public User addUser(User user)throws UserException;
	
	public User deleteUser(Integer id)throws UserException;
	
	public User updateUser(Integer id,User user)throws UserException;
	
	public User getUserById(Integer id)throws UserException;
	
}
