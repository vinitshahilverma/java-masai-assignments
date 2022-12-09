package com.masai.security.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.security.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public List<Employee> findByUserName(String username);
}
