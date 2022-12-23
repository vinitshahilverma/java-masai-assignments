package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.masai.model.SecurityService;
import com.masai.model.User;
import com.masai.repository.UserRepo;

public class userDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepo uRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> opt = uRepo.findById(username);
		
		    User user = opt.get();
		    
		if(user!=null)return new SecurityService(user);
		
		else throw new UsernameNotFoundException("No UserName found...");
		
	}

}
