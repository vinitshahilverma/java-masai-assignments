package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmailException;
import com.masai.model.Email;
import com.masai.repositrory.EmailRepo;

@Service
public class EmailServiceImpl implements EmailService{
	
	@Autowired
	private EmailRepo eRepo;

	@Override
	public Email addEmail(Email email) throws EmailException {
		
		if(email!=null) {
			 email = eRepo.save(email);
			 
			 return email;
		}
		else throw new EmailException("Email can't be null");
		
	}

	@Override
	public Email deleteEmail(Integer id) throws EmailException {
		
		Email email = eRepo.findById(id)
				           .orElseThrow(() -> new EmailException("No email found.."));
		
		eRepo.delete(email);
		
		return email;
	
	}


	@Override
	public Email getEmailById(Integer id) throws EmailException {
		
		Email email1 = eRepo.findById(id)
		           .orElseThrow(() -> new EmailException("No email found.."));
		
		return email1;
		
	}

	@Override
	public List<Email> getAllEmail(Integer id) throws EmailException {
		
		List<Email> emails = eRepo.findAll();
		
		if(emails.size()==0)
			throw new EmailException("No any email found");
		
		return emails;
		
	}

}
