package com.masai.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDto;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService eservice;

	@PostMapping("/employees")
	public ResponseEntity<String> addEmployee(@Valid @RequestBody EmployeeDto employee) throws EmployeeException {

		String savedEmployee = eservice.addEmployee(new Employee(employee));

		return new ResponseEntity<String>(savedEmployee, HttpStatus.OK);

	}



	@PostMapping("/employees/{employee_id}")
	public ResponseEntity<EmployeeDto> updateEmployee(@Valid @RequestBody EmployeeDto employee,
			@PathVariable("employee_id") Integer employee_id) throws EmployeeException {

		EmployeeDto savedEmployee = eservice.updateEmployee(new Employee(employee), employee_id);

		return new ResponseEntity<EmployeeDto>(savedEmployee, HttpStatus.OK);

	}

	@DeleteMapping("/get-employees/{employee_id}")
	public ResponseEntity<EmployeeDto> deleteEmployeeById(@PathVariable("employee_id") Integer employee_id)
			throws EmployeeException {

		EmployeeDto savedEmployee = eservice.deleteEmployeeById(employee_id);

		return new ResponseEntity<EmployeeDto>(savedEmployee, HttpStatus.OK);
	}

	@GetMapping("/get-employees/{employee_id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("employee_id") Integer employee_id)
			throws EmployeeException {

		Employee savedEmployee = eservice.getEmployeeById(employee_id);

		return new ResponseEntity<Employee>(savedEmployee, HttpStatus.OK);
	}



	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeDto>> getAllEmployees() throws EmployeeException {

		List<EmployeeDto> savedEmployee = eservice.getAllEmployees();

		return new ResponseEntity<List<EmployeeDto>>(savedEmployee, HttpStatus.OK);

	}

	

}
