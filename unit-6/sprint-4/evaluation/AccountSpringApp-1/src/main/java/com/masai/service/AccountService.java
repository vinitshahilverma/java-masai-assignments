package com.masai.service;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.modle.Account;
import com.masai.modle.AccountDTO;

public interface AccountService {
	
	public Account openAccount(Account acc)throws AccountException;
	
	public Account closeAccount(Integer accno)throws AccountException;
	
	public Account depositAmount(Integer accno, Integer amount)throws AccountException;
	
	public Account withdrawAmount(int accno, Integer amount)throws AccountException, InsufficientFundException;
	
	public String transferAmount(AccountDTO dto)throws AccountException,InsufficientFundException;
}
