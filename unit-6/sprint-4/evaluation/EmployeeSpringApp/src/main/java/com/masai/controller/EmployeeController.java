package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> registerEmployeeHandler(@Valid @RequestBody Employee employee) throws EmployeeException{
		
		  Employee emp = eService.registerEmployee(employee);
		  
		  return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<Employee> getEmployeeByIdhandler(@PathVariable("empId") Integer empId) throws EmployeeException{
		
		Employee emp = eService.getEmployeeById(empId);
		
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllEmployeeHandler() throws EmployeeException{
		
		List<Employee> list = eService.getAllEmployeeDetails();
		
		return new ResponseEntity<List<Employee>>(list,HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/employee/{empid}")
	public ResponseEntity<Employee> deleteEmployeeHandler(@PathVariable("empId") Integer empId) throws EmployeeException{
		
		Employee emp = eService.deleteEmployeeById(empId);
		
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	
	@GetMapping("/employee/{email}")
	public ResponseEntity<Employee> loginEmployeehandler(@PathVariable("email")String email,@RequestParam(value="password",required = true)String password) throws EmployeeException{
		
		Employee emp = eService.loginEmployee(email, password);
		
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}
	
	@GetMapping("/employee/{address}")
	public ResponseEntity<List<Employee>> getEmployeesbyAddressHandler(@PathVariable("address") String address) throws EmployeeException{
		
		
          List<Employee> list = eService.getEmployeeDetailsByAddress(address);
		
		return new ResponseEntity<List<Employee>>(list,HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmployeeHandler(@Valid @RequestBody Employee emp) throws EmployeeException{
		
		Employee employee = eService.updateEmployee(emp);

		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	@GetMapping("/getByEmployeeId/{empId}")
	public ResponseEntity<String> getNameAndAddressHandler(@PathVariable("empId")Integer empId) throws EmployeeException{
		
		String str = eService.getNameAndAddressOfEmplyeeById(empId);
		
		return new ResponseEntity<String>(str,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/getNameAndSalary")
	public ResponseEntity<List<EmployeeDTO>> getNameAndSalaryHandler() throws EmployeeException{
		
		List<EmployeeDTO> list = eService.getNameAddressSalaryOfAllEmployee();
		
		return new ResponseEntity<List<EmployeeDTO>>(list,HttpStatus.ACCEPTED);
		
	}
	

}
