package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repository.UserRepo;
import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo uRepo;

	@Override
	public List<User> getAllUser() throws UserException {
		
		List<User> list = uRepo.findAll();
		
		if(list.size()==0) {
			throw new UserException("No user Found");
		}
		
		return list;
	}

	@Override
	public User createUser(User user) throws UserException {
		
		  if(user!=null) {
			  User u = uRepo.save(user);
			  
			  return u;
		  }
		  else {
			  throw new UserException("user is null....");
		  }
		   
	}

	@Override
	public User getUserById(Integer id) throws UserException {
		
		User user = uRepo.findById(id)
				         .orElseThrow(() -> new UserException("No user Found.."));
		
		return user;
		   
	}

	@Override
	public User deleteUser(Integer id) throws UserException {
		
		User user = uRepo.findById(id)
		         .orElseThrow(() -> new UserException("No user Found.."));
		
		  uRepo.delete(user);
		  
		  return user;
		
	}

	@Override
	public Email getDetailsOfEmail(Integer uid, Integer mid) throws UserException,EmailException {
		
		User user = uRepo.findById(uid)
		         .orElseThrow(() -> new UserException("No user Found.."));
		
	    Email email = user.getEmail();
	    
	    if(email.getMail_id()==mid) {
	    	return email;
	    }
	    else {
	    	throw new EmailException("Email Id is invalid..");
	    }
		
	}

	@Override
	public User createEmailForuser(Integer id, Email email) throws UserException,EmailException {
		
		
		List<User> list = uRepo.findAll();
		
		for(User u:list) {
			 if(u.getEmail().getEmail().equals(email.getEmail())) {
				 throw new EmailException("Email already Exits...");
			 }
		}
		
		
		User user = uRepo.findById(id)
		         .orElseThrow(() -> new UserException("No user Found.."));
		
		if(user.getEmail().getEmail().equals(email.getEmail())) {
			throw new UserException("user have same email address...");
		}
		
		user.setEmail(email);
		
		uRepo.save(user);
		
		return user;
		
	}

}
