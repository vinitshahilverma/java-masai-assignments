package com.masai.service;

import com.masai.exception.LoginException;
import com.masai.model.Login;

public interface LoginService {
	
	public String loginAccount(Login login) throws LoginException;

	public String logoutAccount(String key) throws LoginException;

}
