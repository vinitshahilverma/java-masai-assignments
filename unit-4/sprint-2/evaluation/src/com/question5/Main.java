package com.question5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	      System.out.println("Enter Id");
	      
	      int id = sc.nextInt();
	      
	      System.out.println("Enter Name");
	      
	      String name = sc.next();
	      
	      System.out.println("Enter Salary");
	      
	      double salary = sc.nextInt();
	      
	      System.out.println("Enter PF percentage");
	      
	      int pf = sc.nextInt();
	      
	      
	      Employee employee = getEmployeeDetails(id,name,salary,pf);
	      
	     System.out.println(employee.getEmployeeId());
	     System.out.println(employee.getEmployeeName());
	     System.out.println(employee.getSalary());
	     System.out.println(employee.getNetSalary());
	      

	}
	
	public static Employee getEmployeeDetails(int id, String name, double salary,int pfPercentage) {
		       
		     Employee employee = new Employee();
		     
		     employee.setEmployeeId(id);
		     employee.setEmployeeName(name);
		     employee.setNetSalary(salary);
		     employee.setNetSalary(pfPercentage);
		     
		     return employee;
	}

}
