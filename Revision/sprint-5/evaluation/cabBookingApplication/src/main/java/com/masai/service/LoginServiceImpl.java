package com.masai.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.LoginException;
import com.masai.model.CurrentUserSession;
import com.masai.model.Login;
import com.masai.model.User;
import com.masai.repository.CurrentUserSessionRepo;
import com.masai.repository.UserRepo;

import net.bytebuddy.utility.RandomString;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserRepo uRepo;
	
	@Autowired
	private CurrentUserSessionRepo sRepo;

	@Override
	public String loginAccount(Login login) throws LoginException {
		
		User user = uRepo.findByMobileNumber(login.getMobile());
		
		if (user != null) {

			if (user.getPassword().equals(login.getPassword())) {

				CurrentUserSession curr = sRepo.findByMobile(login.getMobile());

				if (curr != null) {
					throw new LoginException("User already logged in");
				} else {

					CurrentUserSession curr1 = new CurrentUserSession();

					curr1.setMobile(login.getMobile());
					curr1.setLoginDateTime(LocalDateTime.now());

					String key = RandomString.make(6);
					curr1.setPrivateKey(key);

					sRepo.save(curr1);

					return "Login Successufull";

				}

			} else {
				throw new LoginException("Please Enter a valid password");
			}
		} else {
			throw new LoginException("Please Enter a valid mobile Number");
		}
		
	}

	@Override
	public String logoutAccount(String key) throws LoginException {
		
		CurrentUserSession currSession = sRepo.findByPrivateKey(key);

		if (currSession != null) {
			sRepo.delete(currSession);
			return "Logged Out!";
		} else {
			throw new LoginException("This User is not Logged In");
		}
		
	}

}
