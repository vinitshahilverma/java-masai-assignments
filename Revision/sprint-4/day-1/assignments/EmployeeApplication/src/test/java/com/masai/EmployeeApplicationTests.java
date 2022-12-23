package com.masai;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.repository.EmployeeRepo;
import com.masai.service.EmployeeService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class EmployeeApplicationTests {

	@Autowired
	public EmployeeService eService;
	
	@MockBean
	public static EmployeeRepo eRepo;
	
	@Test
	public void addEmployeeTest() {
		
		Employee emp = new Employee(100,"Shahil","Verma","shahil@mail","7858869609",2000);
		
		when(eRepo.save(emp)).thenReturn(emp);
		
		assertEquals(emp, eRepo.save(emp));
		
	}
	
	@Test
	public void addEmployeeFailTest() {
		
		Exception ex = assertThrows(EmployeeException.class, () -> eService.addEmployee(null));
		
		assertEquals("Employee can't be null..", ex.getMessage());
		
	}
	
	@Test
	public void deleteEmployeeTest() throws EmployeeException {
		
		Employee emp = new Employee(100,"Shahil","Verma","shahil@mail","7858869609",2000);
		
		  eRepo.delete(emp);
		
	     verify(eRepo, times(1)).delete(emp);
	}
	
	
	@Test
	public void deleteEmployeeWithExceptionTest() {
		
		Exception ex = assertThrows(EmployeeException.class, () -> eService.deleteEmployee(102));
		
		
		assertEquals("Employee not Found...", ex.getMessage());
	}
	

}
