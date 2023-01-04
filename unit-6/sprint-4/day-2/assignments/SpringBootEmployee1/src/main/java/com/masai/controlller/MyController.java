package com.masai.controlller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.Employee;

@RestController
public class MyController {
	
	@RequestMapping("/employee")
	public Employee getEmployee() {
		
		Employee emp = new Employee(10,"Shahil",30000);
		
		return emp;
		
	}
	
	@RequestMapping("/employees")
	public List<Employee> getListofEmployee(){
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(10,"Shahil",30000));
		list.add(new Employee(12,"Verma",40000));
		list.add(new Employee(14,"Sandeep",50000));
		list.add(new Employee(16,"Vinit",60000));
		list.add(new Employee(18,"Vicky",70000));

 		return list;
	}
	
	@RequestMapping("/hello")
	public String getMessage() {
		
		return "Welcome to Spring Boot";
		
	}

}
