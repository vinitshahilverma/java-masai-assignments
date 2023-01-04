package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.modle.Account;
import com.masai.modle.AccountDTO;
import com.masai.repository.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService{
    
	@Autowired
	private AccountRepo aRepo;
	
	@Override
	public Account openAccount(Account acc) throws AccountException {
		  
		Account account = aRepo.save(acc);
		
		if(account==null) {
			throw new AccountException("Account not registered...");
		}
		
		return account;
		
	}

	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		
		Account account = aRepo.findById(accno)
				               .orElseThrow(() -> new AccountException("Account not found..."));
		
		aRepo.delete(account);
		
		return account;
		
	}

	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
		
		Account account = aRepo.findById(accno)
	               .orElseThrow(() -> new AccountException("Account not found..."));
		
		account.setBalance(account.getBalance()+amount);
		
		aRepo.save(account);
		
		return account;
	}

	@Override
	public Account withdrawAmount(int accno, Integer amount) throws AccountException, InsufficientFundException {
		
		Account account = aRepo.findById(accno)
	               .orElseThrow(() -> new AccountException("Account not found..."));
		
		if(account.getBalance()<amount) {
			 throw new InsufficientFundException("Insufficient balance...");
		}
		else {
			
			account.setBalance(account.getBalance()-amount);
			
			aRepo.save(account);
			
			return account;
		}
		
		
	}

	@Override
	public String transferAmount(AccountDTO dto) throws AccountException, InsufficientFundException {
		      
		Account srcAccount = aRepo.findById(dto.getSrcAccno())
	               .orElseThrow(() -> new AccountException("Account not found..."));
		
		Account desAccount = aRepo.findById(dto.getDesAccno())
	               .orElseThrow(() -> new AccountException("Account not found..."));
		
		if(desAccount.getBalance()<dto.getAmmount()) {
			throw new InsufficientFundException("Insufficient balance in the sender account...");
		}
		
		else {
			
			desAccount.setBalance(desAccount.getBalance()-dto.getAmmount());
			
			srcAccount.setBalance(srcAccount.getBalance()+dto.getAmmount());
			
			aRepo.save(desAccount);
			aRepo.save(srcAccount);
			
			return "Transfer successfully..";
			
		}
		
	}

}
