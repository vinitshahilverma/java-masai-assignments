package com.masai.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.repository.EmployeeRepo;
import com.masai.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	public EmployeeService empService;

	@MockBean
	private static EmployeeRepo empRepo;

	@Test
	public void addEmployeeTest() throws ClassNotFoundException, IOException, EmployeeException {

		Employee emp = new Employee(1001, "emptest", "emptest", "emptest@gmail.com", "1234567890", 100000);
		when(empRepo.save(emp)).thenReturn(emp);
		assertEquals(emp, empRepo.save(emp));

	}

	@Test
	public void addEmployeeFailTest() throws ClassNotFoundException, IOException, EmployeeException {

		Exception ex = assertThrows(EmployeeException.class, () -> empService.addEmployee(null));

		assertEquals("Invalid data detected", ex.getMessage());

	}

	@Test
	public void deleteEmployeeTest() throws ClassNotFoundException, IOException, EmployeeException {

		Employee emp = new Employee(1001, "emptest", "emptest", "emptest@gmail.com", "1234567890", 100000);
//		empService.deleteEmployeeById(emp.getEmployee_id());
		empRepo.delete(emp);
		verify(empRepo, times(1)).delete(emp);

	}

	@Test
	public void deleteEmployeeWithExceptionTest() {

		Exception ex = assertThrows(EmployeeException.class, () -> empService.deleteEmployeeById(-1));

		assertEquals("Employee id is invalid", ex.getMessage());

	}

}
