package com.masai.service;

import java.util.List;

import com.masai.bean.Employee;
import com.masai.bean.EmployeeException;

public class AppRunner {
	
	public static void main(String[] args) throws EmployeeException {
		
		EmployeeService eService = new EmployeeServiceImpl();
		
		//Add Employee
		Employee emp = eService.addEmployee(new Employee(10,"Shahil","HR",30000));	
		Employee emp1 = eService.addEmployee(new Employee(12,"Verma","HR",40000));
		
//		System.out.println(emp);
	
		//Get All Employee	
		List<Employee> list = eService.getAllEmployee();
		
		System.out.println(list);
		  
		
		//Delete Employee
		
		System.out.println(eService.deleteEmployee(12));
		
		System.out.println(list);
		
		//Get Employee by Id;

		System.out.println(eService.get(10));
		
	}

}
