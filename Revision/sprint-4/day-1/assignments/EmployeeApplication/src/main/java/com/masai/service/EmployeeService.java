package com.masai.service;

import java.util.List;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public interface EmployeeService {
	
	public Employee getEmployeeById(Integer id)throws EmployeeException;
	
	public Employee addEmployee(Employee employee)throws EmployeeException;
	
	public Employee deleteEmployee(Integer id)throws EmployeeException;
	
	public Employee updateEmployee(Integer id,Employee employee)throws EmployeeException;

}
