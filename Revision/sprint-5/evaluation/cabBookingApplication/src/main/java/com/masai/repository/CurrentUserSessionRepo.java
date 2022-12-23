package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.CurrentUserSession;

@Repository
public interface CurrentUserSessionRepo extends JpaRepository<CurrentUserSession, Integer>{
	
	public CurrentUserSession findByMobile(Long mobile);
	
	public CurrentUserSession findByPrivateKey(String key);

}
