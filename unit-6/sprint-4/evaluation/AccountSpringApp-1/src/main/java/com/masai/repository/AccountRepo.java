package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.modle.Account;
import com.masai.modle.AccountDTO;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer>{
	

}
