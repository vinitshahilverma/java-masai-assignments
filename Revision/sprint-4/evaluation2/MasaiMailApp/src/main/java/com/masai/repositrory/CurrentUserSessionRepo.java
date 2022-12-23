package com.masai.repositrory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.CurrentUserSession;

@Repository
public interface CurrentUserSessionRepo extends JpaRepository<CurrentUserSession, Integer>{
	
	public CurrentUserSession findByEmail(String email);

	public CurrentUserSession findByPrivateKey(String key);

}
