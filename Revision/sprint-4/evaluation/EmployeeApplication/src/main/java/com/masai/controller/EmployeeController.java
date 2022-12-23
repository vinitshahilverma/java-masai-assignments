package com.masai.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService eService;

	@GetMapping("/Employees")
	public ResponseEntity<List<Employee>> getAllEmployeeHandler() throws EmployeeException {

		List<Employee> list = eService.getAllEmployee();

		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);

	}

	@GetMapping("/get-all-reportees/{id}")
	public ResponseEntity<List<Employee>> getAllEmployeeByMangaerIdHandler(@PathVariable("id") Integer id)
			throws EmployeeException {

		List<Employee> list = eService.getAllEmployeeByMangerId(id);

		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);

	}

	@PatchMapping("/registerEmployeeToManger/{eid}/{mid}")
	public ResponseEntity<Employee> registerEmployeeWithMangerHandler(@PathVariable("eid") Integer id,
			@PathVariable("mid") Integer mid) throws EmployeeException {

		Employee employee = eService.registerEmployeeToManager(id, mid);

		return new ResponseEntity<Employee>(employee, HttpStatus.OK);

	}

	@PostMapping("/employees")
	public ResponseEntity<Employee> registerEmployeeHandler(@RequestBody Employee emp) throws EmployeeException {

		Employee employee = eService.addEmployee(emp);

		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);

	}
	
	@GetMapping("get-employee-manager/{eid}")
	public ResponseEntity<Employee> getEmployeeMangerHandler(@PathVariable("eid") Integer id)throws EmployeeException {
			
		Employee employee = eService.getEmployeeManager(id);

		return new ResponseEntity<Employee>(employee, HttpStatus.OK);

	}
	
	@GetMapping("get-employees/{id}")
	public ResponseEntity<Map<Employee,List<Employee>>> getEmployeeAndThierRepoteesHandler(@PathVariable("id") Integer id) throws EmployeeException{
		
		Employee employee = eService.getEmployeeById(id);
		
		List<Employee> list = eService.getAllEmployeeByMangerId(id);
		
		Map<Employee,List<Employee>> map = new HashMap<>();
		
		map.put(employee,list);

		return new ResponseEntity<Map<Employee,List<Employee>>>(map,HttpStatus.OK);
		
	}
	
	@GetMapping("/get-all-ReporteesAtAllLevel/{id}")
	public ResponseEntity<List<Employee>> getAllEmployeeByMangaerIdAllLevelHandler(@PathVariable("id") Integer id)
			throws EmployeeException {
		
		List<Employee> list = new ArrayList<>();

		 eService.getAllReporteesAtAllLevel(id,list);

		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);

	}
	

}
