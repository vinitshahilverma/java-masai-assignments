package com.question4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static Collection<Employee> employee = new ArrayList<>();

	public static void printDetails() {

		HashSet<Employee> e1 = new HashSet<>(employee);
        
		if(e1.size()==0) {
			
			System.out.println("Employee doesn't exists");
			
		}
		
		else {
		System.out.println(e1);
		}
	}

	public static void printByDepartment(int id) {

		List<Employee> e1 = new ArrayList<>(employee);

		ArrayList<Employee> e2 = new ArrayList<>();

		for (int i = 0; i < e1.size(); i++) {

			if (e1.get(i).getDepartment().getDepartmentId() == id) {

				e2.add(e1.get(i));
			}
		}

		System.out.println(e2);
	}

	public static void removeEmployee(int dep,int id) {

		List<Employee> e1 = new ArrayList<>(employee);

		for (int i = 0; i < e1.size(); i++) {

			if (e1.get(i).getEmployeeId() == id && e1.get(i).getDepartment().getDepartmentId() == dep) {
				
				System.out.println(e1.get(i).getEmployeeName()+ " Employee is removed from the department "+e1.get(i).getDepartment().getDepartmentId()+" successfully. ");

				e1.remove(e1.get(i));
			}
		}

		employee = new ArrayList<>(e1);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee managment System");

		Scanner sc = new Scanner(System.in);
        
		int i =1;
		
		while (true) {
			System.out.println("Do you want to Enter the detail of Employee:? (y/n)");

			String choice = sc.next();

			if (choice.equals("y")) {
				
				System.out.println("Enter Employee Details : " + i++);
				
				System.out.println("-------------------------------------");
				
				System.out.println("Enter the Employee id");
				int id = sc.nextInt();

				System.out.println("Enter the Employee name");
				String name = sc.next();

				System.out.println("Enter the Employee Salary");
				double salary = sc.nextDouble();

				System.out.println("Enter the Department Id");
				int d_id = sc.nextInt();

				System.out.println("Enter the Department name");
				String d_name = sc.next();

				Employee e1 = new Employee(id, name, salary, d_id, d_name);
				
				System.out.println("Employee added successfully..");
				
				employee.add(e1);

			}

			else {

				System.out.println("Thank you..");
				break;
			}
		}

		while (true) {

			System.out.println("Enter your choice");

			System.out.println("1.Find Employee in Particular Department");
			System.out.println("2.Remove Particular Employee");
			System.out.println("3.Print Employees in All Departments");

			int choice = sc.nextInt();

			if (choice == 3) {

				printDetails();

			}

			else if (choice == 1) {

				System.out.println("Enter the Department Id");
				int id = sc.nextInt();

				printByDepartment(id);
			}

			else if (choice == 2) {
				
				System.out.println("Enter the department id");
				int d_id = sc.nextInt();
 
				System.out.println("Enter the Employee Id");
				int id = sc.nextInt();
          
				removeEmployee(d_id,id);

			}
			
			System.out.println("Do you want to Exit:? (y/n)");
			
			if(sc.next().equals("y")) {
				
			 System.out.println("Thank you..");
				break;
			}
		}
	}

}
