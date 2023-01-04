package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	@Query("Select e from Employee e where name=?1 AND password=?2")
	public Employee getEmployeeByEmailAndPassword(String email,String password);
	
	
	public List<Employee> findByAddress(String address);
	
	@Query("Select new com.masai.model.EmployeeDTO(e.name,e.address,e.salary) from Employee e")
	public List<EmployeeDTO> getEmployeeNameAddressAndSalary();

}
