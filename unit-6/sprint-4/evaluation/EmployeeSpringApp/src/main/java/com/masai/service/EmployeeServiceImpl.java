package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
	@Autowired
	private EmployeeRepo eRepo;
	
	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
		
		 Employee employee = eRepo.save(emp);
		 
		 if(employee==null) {
			 throw new EmployeeException("Emplolyee not saved...");
		 }
		 
		 return employee;
		 
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		
		Employee emp = eRepo.findById(empId)
				            .orElseThrow(() ->  new EmployeeException("Employee not found"));
		
		return emp;
		   
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		
		List<Employee> list = eRepo.findAll();
		
		if(list.size()==0) {
			throw new EmployeeException("No Employee found...");
		}
		
		return list;
		
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
		         
		Employee emp = eRepo.findById(empId)
	            .orElseThrow(() ->  new EmployeeException("Employee not found"));
		
		 eRepo.delete(emp);
		 
		 return emp;
	}

	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {
		  
		Employee emp = eRepo.getEmployeeByEmailAndPassword(email, password);
		
		 if(emp==null) {
			 throw new EmployeeException("Emplolyee not saved...");
		 }
		 
		 return emp;
		
		
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {
		
		 List<Employee> list = eRepo.findByAddress(address);
		 
		 if(list.size()==0) {
				throw new EmployeeException("No Employee found...");
			}
			
			return list;
		
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		
		Employee employee = eRepo.findById(emp.getEmpId())
	            .orElseThrow(() ->  new EmployeeException("Employee not found"));
		    
		 return employee;
	}

	@Override
	public String getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
		   
		Employee employee = eRepo.findById(empId)
	            .orElseThrow(() ->  new EmployeeException("Employee not found"));
		
		
		return employee.getEmpName()+" "+employee.getAddress();
		
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		      
		List<EmployeeDTO> list = eRepo.getEmployeeNameAddressAndSalary();
		
		if(list.size()==0) {
			throw new EmployeeException("No Employee found...");
		}
		
		return list;
		
	}

}
