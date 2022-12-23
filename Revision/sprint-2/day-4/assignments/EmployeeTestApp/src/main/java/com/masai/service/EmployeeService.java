package com.masai.service;

import java.util.List;

import com.masai.bean.Employee;
import com.masai.bean.EmployeeException;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	
	public boolean deleteEmployee(int empId)throws EmployeeException;
	
	public List<Employee> getAllEmployee();
	
	public Employee get(int empId);

}
