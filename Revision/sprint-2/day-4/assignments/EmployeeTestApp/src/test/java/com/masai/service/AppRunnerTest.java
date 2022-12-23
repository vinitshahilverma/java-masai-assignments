package com.masai.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.masai.bean.Employee;
import com.masai.bean.EmployeeException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;

public class AppRunnerTest {
	
		public static EmployeeService eService = null;

        @BeforeAll
		public static void BeforeAll() {
		   eService = new EmployeeServiceImpl();
		   eService.addEmployee(new Employee(15,"Shahil","HR",30000));
		   System.out.println("Employee Service Initialized.....");
		}
        
        @Test
        public void addEmployeeTest() {
        	
        	Employee emp = new Employee(10,"Shahil","HR",30000);
        	
        	assertEquals(emp,eService.addEmployee(emp));
        }
        
        @Test
        public void addEmployeeFailTest() {
        	
        	Employee emp =null;
        	
        	assertEquals(emp,eService.addEmployee(emp));
        	
        }
        
        @Test
        public void deleteEmployeeTest() throws EmployeeException {
        	
        	assertTrue(eService.deleteEmployee(10));
        	
        }
        
        @Test
        public void deleteEmployeeWithExceptionTest() {
        	
        	assertThrows(EmployeeException.class,() -> eService.deleteEmployee(12));
        	
        }

	

}
