package com.ambula.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambula.exception.UserException;
import com.ambula.model.user_location;
import com.ambula.repository.userRepo;


@Service
public class userServiceImpl implements userService{
	
	@Autowired
	private userRepo uRepo;

	@Override
	public user_location createUser(user_location user) throws UserException {
		
		if(user!=null) {
           uRepo.save(user);
		}
		
		else throw new UserException("User can't be Empty");
		
		return user;
		
	}

	@Override
	public user_location updateUser(user_location user) throws UserException {
		
		user_location user1 = uRepo.findById(user.getId()).orElseThrow(() -> new UserException("No User found.."));
		
		user1 = uRepo.save(user);
		
		return user1;
	}

	@Override
	public List<user_location> getAllUser() throws UserException {
		
		List<user_location> user = uRepo.findAll();
		
		if(user!=null) return user;
		
		else throw new UserException("No User found..");
		
	}

	@Override
	public List<user_location> getUserByLocation(int n,int lat, int log) throws UserException {
		
		List<user_location> userList = new ArrayList<>();
		
		List<user_location> user = uRepo.findAll();
		
		for(user_location u:user) {
			if(u.getLatitude()==lat && u.getLongitude()==log && userList.size()<n) {
				userList.add(u);
			}
		}
		
		if(userList.size()==0) {
			throw new UserException("No user found on the location");
		}
		
		return userList;
		
	}

	@Override
	public user_location getUserByUserId(int id) throws UserException {
		
		user_location user = uRepo.findById(id).orElseThrow(() -> new UserException("No user found"));
		
		return user;
	}

}
