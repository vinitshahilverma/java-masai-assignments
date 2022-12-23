package com.masai.repositrory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Email;
import com.masai.model.User;

@Repository
public interface EmailRepo extends JpaRepository<Email, Integer>{
	
	

}
