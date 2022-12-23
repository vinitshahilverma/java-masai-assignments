package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.PostExcepiton;
import com.masai.exception.UserException;
import com.masai.model.Post;
import com.masai.model.User;
import com.masai.repository.UserRepo;

import io.swagger.v3.oas.annotations.servers.Server;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo uRepo;
     
	@Override
	public List<Post> getAllPostsByUserId(Integer id) throws UserException, PostExcepiton {
		 
	   User user = uRepo.findById(id)
			            .orElseThrow(() -> new UserException("user not found"));
	   
	   List<Post> list = user.getPosts();
	   
	   if(list.size()==0) {
		   throw new  PostExcepiton("Posts Not found");
	   }
	   
	   return list;
		                
	}

	@Override
	public User addUser(User user) throws UserException {
		 if(user!=null) {
			 user = uRepo.save(user);
			 
			 return user;
		 }
		 else throw new UserException("User is null");
	}

	@Override
	public User deleteUser(Integer id) throws UserException {
		
		User user = uRepo.findById(id)
				         .orElseThrow(() ->  new UserException("user not found"));
		
		 uRepo.delete(user);
		 
		 return user;
	}

	@Override
	public User updateUser(Integer id, User user) throws UserException {

		User user1 = uRepo.findById(id)
		         .orElseThrow(() ->  new UserException("user not found"));
		
		user.setId(id);
		
		user = uRepo.save(user);
		
		return user;
            
	}

	@Override
	public User getUserById(Integer id) throws UserException {
		
		User user1 = uRepo.findById(id)
		         .orElseThrow(() ->  new UserException("user not found"));
		
		return user1;
		
	}

}
