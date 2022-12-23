package com.masai.service;

import java.util.List;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public interface EmployeeService {
	
	public Employee getEmployeeById(Integer id)throws EmployeeException;
	
	public Employee addEmployee(Employee employee)throws EmployeeException;
	
	public Employee getEmployeeManager(Integer id)throws EmployeeException;
	
	public Employee registerEmployeeToManager(Integer eid,Integer mid)throws EmployeeException;
	
	public List<Employee> getAllEmployeeByMangerId(Integer id)throws EmployeeException;
	
	public List<Employee> getAllEmployee()throws EmployeeException;
	
	public void getAllReporteesAtAllLevel(Integer id,List<Employee> list)throws EmployeeException;

}
