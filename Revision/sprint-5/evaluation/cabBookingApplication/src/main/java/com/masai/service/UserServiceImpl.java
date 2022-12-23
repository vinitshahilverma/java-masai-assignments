package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.DriverException;
import com.masai.exception.UserException;
import com.masai.model.Driver;
import com.masai.model.User;
import com.masai.repository.DriverRepo;
import com.masai.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    private DriverRepo dRepo;
    
    @Autowired
    private UserRepo uRepo;

	@Override
	public User addUser(User user) throws UserException {
		
		if(user==null) throw new UserException("UserDetails can't be null...");
		
		user = uRepo.save(user);
		
		return user;

	}

	@Override
	public List<Driver> getListOfAvaliableDriver(Integer id) throws UserException, DriverException {
		
		User user = uRepo.findById(id).orElseThrow(()-> new UserException("No user Found...."));
		
		List<Driver> avaDrivers = new ArrayList<>();
		
		List<Driver> drivers = dRepo.findAll();
		
		if(drivers.size()==0)throw new DriverException("No Cab Found...");
		
		for(Driver d:drivers) {
			
			    int m = d.getCurrentPosition()[0] - user.getCurrentPosition()[0];
			    
			    int x = (int)Math.pow(m, 2);
			    
			    int n = d.getCurrentPosition()[1] - user.getCurrentPosition()[1];
			    
			    int y = (int)Math.pow(n, 2);
			    
			    int dis = (int)Math.pow((x+y),0.5);
			    
			    if(dis<=5) {
			    	avaDrivers.add(d);
			    }
			
		}
		
		if(avaDrivers.size()==0)throw new DriverException("No Cab Found...");
		
		return avaDrivers;
		
	}

	@Override
	public Driver bookDriver(Integer uId, Integer dId, Integer x, Integer y)
			throws UserException, DriverException {
		
		
		User user = uRepo.findById(uId).orElseThrow(()-> new UserException("No user Found...."));
		
		Driver driver = dRepo.findById(dId).orElseThrow(() -> new DriverException("No Driver Found..."));
		
		int m = driver.getCurrentPosition()[0] - user.getCurrentPosition()[0];
	    
	    int r = (int)Math.pow(m, 2);
	    
	    int n = driver.getCurrentPosition()[1] - user.getCurrentPosition()[1];
	    
	    int z = (int)Math.pow(n, 2);
	    
	    int dis = (int)Math.pow((r+z),0.5);
	    
	    if(dis>5) {
	    	throw new DriverException("Driver is out of Range...");
	    }
		
	    driver.getCurrentPosition()[0]=x;
	    driver.getCurrentPosition()[1]=y;
	    
	    user.getCurrentPosition()[0]=x;
	    user.getCurrentPosition()[1]=y;
	    
	    return driver; 
	}

	@Override
	public User findByMobileNumber(Long mobile) throws UserException {
		
		User user = uRepo.findByMobileNumber(mobile);
		
	     if(user==null) throw new UserException("No user found");
	     
	     return user;
		
	}

}
