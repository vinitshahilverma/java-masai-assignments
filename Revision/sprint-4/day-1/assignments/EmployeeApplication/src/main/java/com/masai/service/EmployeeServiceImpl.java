package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo eRepo;
	

	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeException {
		   
	    Employee employee = eRepo.findById(id)
	    		                 .orElseThrow(() -> new EmployeeException("Employee not Found..."));
	    
	    return employee;
		
	}

	@Override
	public Employee addEmployee(Employee employee) throws EmployeeException {
		
		if(employee!=null) {
			
			employee = eRepo.save(employee);
			
			return employee;
		}
		
		else throw new  EmployeeException("Employee can't be null..");
		
	}

	@Override
	public Employee deleteEmployee(Integer id) throws EmployeeException {
		  
		 Employee employee = eRepo.findById(id)
                 .orElseThrow(() -> new EmployeeException("Employee not Found..."));
		 
		 eRepo.delete(employee);
		
		 return employee;
	}

	@Override
	public Employee updateEmployee(Integer id, Employee employee) throws EmployeeException {
		
		 Employee employee1 = eRepo.findById(id)
                 .orElseThrow(() -> new EmployeeException("Employee not Found..."));
		 
		 employee.setId(id);
		 
		 employee = eRepo.save(employee);
		 
		 
		 return employee;
		
	}

	
	
	

}
