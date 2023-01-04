package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.modle.Account;
import com.masai.modle.AccountDTO;
import com.masai.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService aService;
	
	@PostMapping("/account")
	public ResponseEntity<Account> registerAccountHandler(@RequestBody Account account) throws AccountException{
		
		Account acc = aService.openAccount(account);
		
		return new ResponseEntity<Account>(acc,HttpStatus.CREATED);
	}
	
	@GetMapping("/accoount/{accountNo}")
	public ResponseEntity<Account> closeAccountHandler(@PathVariable("accountNo")Integer accountNo) throws AccountException{
		   
		Account acc = aService.closeAccount(accountNo);
		
		return new ResponseEntity<Account>(acc,HttpStatus.OK);
		
	}
	
	@PutMapping("/depositeAccoount/{accountNo}")
	public ResponseEntity<Account> depositeAmountHandler(@PathVariable("accountNo")Integer accountNo,@RequestParam(value="amount")Integer amount) throws AccountException{
		   
		Account acc = aService.depositAmount(accountNo, amount);
	
		return new ResponseEntity<Account>(acc,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/withdrawAccoount/{accountNo}")
	public ResponseEntity<Account> withdrawAmountHandler(@PathVariable("accountNo")Integer accountNo,@RequestParam(value="amount")Integer amount) throws AccountException, InsufficientFundException{
		   
		Account acc = aService.withdrawAmount(accountNo, amount);
	
		return new ResponseEntity<Account>(acc,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("transefer")
	public ResponseEntity<String> transferAmountHandler(@RequestBody AccountDTO dto) throws AccountException, InsufficientFundException{
		
		String str = aService.transferAmount(dto);
		
		return new ResponseEntity<String>(str,HttpStatus.ACCEPTED);
		
	}

}
