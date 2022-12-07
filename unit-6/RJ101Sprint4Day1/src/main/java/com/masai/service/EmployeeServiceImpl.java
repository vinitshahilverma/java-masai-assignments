package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDto;
import com.masai.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo erepo;

	@Override
	public String addEmployee(Employee employee) throws EmployeeException {

		if (employee == null || employee.getEmployee_id() != null) {
			throw new EmployeeException("Invalid data detected");
		}

		Employee savedEmployee = erepo.save(employee);

		return "Employee Registered with id: " + savedEmployee.getEmployee_id();

	}

	@Override
	public EmployeeDto updateEmployee(Employee employee, Integer employee_id) throws EmployeeException {

		if (employee_id == null || employee == null) {
			throw new EmployeeException("Invalid / null data detected");
		}

		Optional<Employee> empOptional = erepo.findById(employee_id);

		if (empOptional.isPresent()) {

			Employee emp = empOptional.get();

			emp.updateEmployee(employee);

			Employee savedEmployee = erepo.save(emp);

			return new EmployeeDto(savedEmployee);

		} else {
			throw new EmployeeException("Employee id is invalid");
		}
	}

	@Override
	public EmployeeDto deleteEmployeeById(Integer employee_id) throws EmployeeException {

		if (employee_id == null) {
			throw new EmployeeException("Employee id is invalid");
		}

		Optional<Employee> empOptional = erepo.findById(employee_id);

		if (empOptional.isPresent()) {

			Employee savedEmployee = empOptional.get();

			erepo.delete(savedEmployee);

			return new EmployeeDto(savedEmployee);

		} else {
			throw new EmployeeException("Employee id is invalid");
		}

	}

	@Override
	public Employee getEmployeeById(Integer employee_id) throws EmployeeException {

		if (employee_id == null) {
			throw new EmployeeException("Invalid / null data detected");
		}

		Optional<Employee> empOptional = erepo.findById(employee_id);

		if (empOptional.isPresent()) {

			Employee savedEmployee = empOptional.get();

			return savedEmployee;

		} else {
			throw new EmployeeException("Employee id is invalid");
		}

	}

	@Override
	public List<EmployeeDto> getAllEmployees() throws EmployeeException {

		List<Employee> list = erepo.findAll();

		if (list.isEmpty())
			throw new EmployeeException("No Employee found in database");

		List<EmployeeDto> employees = new ArrayList<>();

		for (Employee emp : list) {
			employees.add(new EmployeeDto(emp));
		}

		return employees;

	}

}
