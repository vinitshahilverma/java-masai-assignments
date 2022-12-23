package com.masai.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.CurrentUserSession;
import com.masai.model.FIR;
import com.masai.model.Login;
import com.masai.model.User;
import com.masai.repository.CurrentUserSessionRepo;
import com.masai.repository.UserRepo;

import net.bytebuddy.utility.RandomString;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo uRepo;

	@Autowired
	private CurrentUserSessionRepo sRepo;

	@Override
	public User registerUser(User user) throws UserException {

		if (user == null)
			throw new UserException("User details can't be null");

		else {

			user = uRepo.save(user);
			return user;

		}

	}

	@Override
	public String loginUser(Login login) throws LoginException {

		User user = uRepo.findByUserName(login.getUserName());

		if (user != null) {

			if (user.getPassword().equals(login.getPassword())) {

				CurrentUserSession curr = sRepo.findByUserName(login.getUserName());

				if (curr != null) {
					throw new LoginException("User already logged in");
				} else {

					CurrentUserSession curr1 = new CurrentUserSession();

					curr1.setUserName(login.getUserName());
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
			throw new LoginException("Please Enter a valid User Name");
		}

	}

	@Override
	public List<FIR> getAllTheListOfFIR(String key) throws UserException, FIRException {

		CurrentUserSession curr = sRepo.findByPrivateKey(key);

		String name = curr.getUserName();

		User user = uRepo.findByUserName(name);

		if (user == null)
			throw new UserException("No user Found....");

		List<FIR> firs = user.getFirs();

		if (firs.size() == 0)
			throw new FIRException("No FIR found...");

		return firs;

	}

	@Override
	public String withDrawFIR(Integer firId, Integer id, String key) throws UserException, FIRException {

		User user = uRepo.findById(id).orElseThrow(() -> new UserException("No user Found with id " + id));

		CurrentUserSession curr = sRepo.findByPrivateKey(key);

		String name = curr.getUserName();

		User user1 = uRepo.findByUserName(name);
		
		if(user1.getId()!=id) {
			
			return "Please login........";
	
		}
		
		List<FIR> firs = user.getFirs();
		
		if(firs.size()==0)throw new FIRException("No FIR founds");
		
		for(FIR f:firs) {
			
		    if(f.getFirId()==firId) {
		    	
		         LocalDateTime ltd = f.getTimeStamp();
		         
		         LocalDateTime now = LocalDateTime.now();
		         
		        long sec = ChronoUnit.SECONDS.between(ltd, now);
		        
		        if(sec>86400) {
		        	throw new FIRException("FIR must be of under 24 hours");
		        }
		        else {
		        	
		        	firs.removeIf( l -> l.getFirId()==firId);
		        	
		        	uRepo.save(user);
		        	
		        	return "FIR Withdrawal Successfully...";
		        	
		        }
		    }

		}
		
		return "FIR Withdrawal Successfully...";
		
	}

}
