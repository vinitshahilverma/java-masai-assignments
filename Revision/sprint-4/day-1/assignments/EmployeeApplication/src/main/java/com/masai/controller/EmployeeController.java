package com.masai.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService eService;


	@PostMapping("/employees")
	public ResponseEntity<Employee> registerEmployeeHandler(@RequestBody Employee emp) throws EmployeeException {

		Employee employee = eService.addEmployee(emp);

		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);

	}
	
    @DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmployeeHandler(@PathVariable("id")Integer id) throws EmployeeException {

		Employee employee = eService.deleteEmployee(id);

		return new ResponseEntity<Employee>(employee, HttpStatus.OK);

	}
	
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployeeHandler(@RequestBody Employee emp,@PathVariable("id")Integer id) throws EmployeeException {

		Employee employee = eService.updateEmployee(id, emp);

		return new ResponseEntity<Employee>(employee, HttpStatus.OK);

	}
    
    @GetMapping("/employees/{id}")
   	public ResponseEntity<Employee> getEmployeeByIdHandler(@PathVariable("id")Integer id) throws EmployeeException {

   		Employee employee = eService.getEmployeeById(id);

   		return new ResponseEntity<Employee>(employee, HttpStatus.OK);

   	}

}
