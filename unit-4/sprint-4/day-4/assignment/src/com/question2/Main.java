package com.question2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          
          TreeSet<Employee> ts = new TreeSet<>();
          
          
          for(int i=0; i<4; i++) {
        	  
        	  System.out.println("Enter the Details of Emplyee " +(i+1) );
        	  
        	  System.out.println("Enter Id");
        	  int id = sc.nextInt();
        	  
        	  System.out.println("Enter name");
        	  String name = sc.next();
        	  
        	  System.out.println("Enter salary");
        	  double salary = sc.nextDouble();
        	  
        	  Employee e1 = new Employee(id,name,salary);
    
        	  ts.add(e1);
        	  
          }
          
       
          for(Employee i:ts) {
        	  System.out.println(i);
          }
	}

}
