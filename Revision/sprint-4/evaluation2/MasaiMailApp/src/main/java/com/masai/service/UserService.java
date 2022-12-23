package com.masai.service;

import java.util.List;

import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;

public interface UserService {
	
	public User addUser(User user)throws UserException;
	
	public User deleteUser(Integer id)throws UserException;
	
	public User getUserById(Integer id)throws UserException;
	
	public User updateUser(Integer id,User user)throws UserException;
	
	public List<User> getAllUsers()throws UserException;
	
	public List<Email> getAllMails(Integer id)throws UserException;
	
	public List<Email> getAllStartedMails(Integer id)throws UserException;
	
	public String sendMailToUser(Integer id,Email email,List<String> mail)throws UserException,EmailException;

	public String starMail(Integer userId,Integer eid)throws EmailException,UserException; 
	
	public String deteleMailFromStar(Integer userId,Integer eid)throws EmailException,UserException;
	
	public String deteleMail(Integer userId,Integer eid)throws EmailException,UserException;
}
