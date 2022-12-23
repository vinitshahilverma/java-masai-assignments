package com.masai.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.masai.model.Person;
import com.masai.model.SecurityUser;
import com.masai.repository.PersonRepo;

public class PersonDetailsService implements UserDetailsService{
	
	@Autowired
	private PersonRepo pRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Person person = pRepo.findByEmail(username);
		
		if(person!=null) return new SecurityUser(person);
		
		else throw new UsernameNotFoundException("No username found..");
		
	}

}
