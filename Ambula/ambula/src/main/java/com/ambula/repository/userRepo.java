package com.ambula.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ambula.model.user_location;

@Repository
public interface userRepo extends JpaRepository<user_location, Integer>{
	
	

}
