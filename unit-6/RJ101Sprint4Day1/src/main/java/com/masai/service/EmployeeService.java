package com.masai.service;

import java.util.List;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDto;

public interface EmployeeService {

	public String addEmployee(Employee employee) throws EmployeeException;

	public EmployeeDto updateEmployee(Employee employee, Integer employee_id) throws EmployeeException;

	public EmployeeDto deleteEmployeeById(Integer employee_id) throws EmployeeException;

	public Employee getEmployeeById(Integer employee_id) throws EmployeeException;

	public List<EmployeeDto> getAllEmployees() throws EmployeeException;

}
