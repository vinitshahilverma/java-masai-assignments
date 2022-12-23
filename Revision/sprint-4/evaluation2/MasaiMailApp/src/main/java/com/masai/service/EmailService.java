package com.masai.service;

import java.util.List;

import com.masai.exception.EmailException;
import com.masai.model.Email;

public interface EmailService {
	
   public Email addEmail(Email email)throws EmailException;
   
   public Email deleteEmail(Integer id)throws EmailException;
  
   public Email getEmailById(Integer id)throws EmailException;
   
   public List<Email> getAllEmail(Integer id)throws EmailException;

}
