package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Employee;
import com.masai.bean.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService{
	
	
	List<Employee> list = new ArrayList<>();

	@Override
	public Employee addEmployee(Employee employee) {
		
		list.add(employee);
		
		return employee;
	}

	@Override
	public boolean deleteEmployee(int empId) throws EmployeeException {
		
		boolean ans = list.removeIf(e -> e.getEmpId()==empId);
		
		if(ans==true) 
			return true;
		
		else {
			throw new EmployeeException("No employee found");
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		return list;
	}

	@Override
	public Employee get(int empId) {
		
		Employee emp = list.stream().filter(s -> s.getEmpId()==empId).findAny()
				.orElse(null);
				                  
		
		return emp;
		
	}

}
