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
			
			eRepo.save(employee);
			
			return employee;
		}
		
		else throw new  EmployeeException("Employee can't be null..");
		
	}

	@Override
	public Employee getEmployeeManager(Integer id) throws EmployeeException {
		
		 Employee employee = eRepo.findById(id)
                 .orElseThrow(() -> new EmployeeException("Employee not Found..."));
		
		if(employee.getManagerId()==null)throw new EmployeeException("Employee has no Mangager...");
		 
		else{Employee manager = eRepo.findById(employee.getManagerId())
                          .orElseThrow(() -> new EmployeeException("Employee has no Mangager..."));
		
		return manager;
		}
		 
		
	}

	@Override
	public Employee registerEmployeeToManager(Integer eid, Integer mid) throws EmployeeException {
		  
		Employee employee = eRepo.findById(eid)
                .orElseThrow(() -> new EmployeeException("Employee not Found..."));
		
		 if(employee.getManagerId()!=null){
			 throw new EmployeeException("Employee has already register with a manager");
		 }
		 else if(employee.getPosition().equals("CEO") || employee.getPosition().equals("CEO")) {
			 throw new EmployeeException("This employee(CEO/CTO) type cant't have a manager");
		 }
		 
		 employee.setManagerId(mid);
		 
		 eRepo.save(employee);
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployeeByMangerId(Integer id) throws EmployeeException {
		  
		List<Employee> employees = eRepo.getAllEmployeeByManagerId(id);
		
		if(employees.size()==0) {
			throw new EmployeeException("No Employee Registered....");
		}
		
		return employees;
		
	}

	@Override
	public List<Employee> getAllEmployee() throws EmployeeException {
		
		List<Employee> employees = eRepo.findAll();
		
		if(employees.size()==0) {
			throw new EmployeeException("No Employee Registered....");
		}
		
		return employees;
		
	}
	
	public void getAllReporteesAtAllLevel(Integer id,List<Employee> list1)throws EmployeeException{
		
		Employee employee = eRepo.findById(id)
                .orElseThrow(() -> new EmployeeException("Employee not Found..."));
		
		
		
		
		List<Employee> list = eRepo.getAllEmployeeByManagerId(id);
		
		if(!list.isEmpty()) {
		
		 for(Employee e:list) {

			    list1.add(e);
			    
			    getAllReporteesAtAllLevel(e.getId(),list1);
		 }
		}
		
	}
	
	

}
