package com.UseCase;

import java.util.Scanner;

import com.Dao.EmployeeDao;
import com.Dao.EmployeeDaoImpl;
import com.exception.EmployeeException;
import com.masai.bean.Employee;

public class EmployeeById {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee Id which you want to get..");
        
        int id = sc.nextInt();
        
        EmployeeDao dao = new EmployeeDaoImpl();
        
         try {
			Employee emp = dao.getEmployeeById(id);
			
			System.out.println(emp);
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
        

	}

}
