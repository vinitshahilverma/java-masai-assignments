package com.masai.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployeeHandler(){
		
		List<Employee> list = Arrays.asList(
			new Employee(1,"Shahil","dept1",20000),
			new Employee(2,"Verma","dept2",30000),
			new Employee(3,"Vinit","dept3",25000),
			new Employee(4,"Verma","dept4",26000)
	   );
		
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/employees/1")
	public ResponseEntity<Employee> getEmployeeByIdHandler(){

		Employee list = new Employee(1,"Shahil","dept1",20000);
		
		return new ResponseEntity<Employee>(list,HttpStatus.OK);
		
	}

}
