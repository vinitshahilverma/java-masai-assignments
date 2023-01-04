package com.beans;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.utility.EMUtil;

public class InsertEmployee {
    
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
             
		  SalariedEmployee s1 = new SalariedEmployee();
		  
		  System.out.println("Enter the deatils of employee "+ (i+1));
		  
		  System.out.println("Enter employee Name");
		  s1.setName(sc.next());
		  
		  System.out.println("Enter employee Email");
		   s1.setEmail(sc.next());
		   
		   System.out.println("Enter employee Email");
		   s1.setSalary(sc.nextInt());
		   
		   
		   em.getTransaction().begin();
		   
		   em.persist(s1);
		   
		   em.getTransaction().commit();
		   
		   System.out.println("Empoyee " + (i+1) + "Registered successfully");
		   
		   em.close();
	
		}
		
		
		for(int i=0; i<4; i++) {
            
			  ContractualEmployee s1 = new ContractualEmployee();
			  
			  System.out.println("Enter the deatils of employee "+ (i+1));
			  
			  System.out.println("Enter employee Name");
			  s1.setName(sc.next());
			  
			  System.out.println("Enter employee No of working Days");
			   s1.setNoOfWorkingDays(sc.nextInt());
			   
			   System.out.println("Enter employee Cost per Day");
			   s1.setCostOfPerDay(sc.nextInt());
			   
			   System.out.println("Enter employee mobile number");
			   s1.setMobileNumber(sc.next());;
			   
			   em.getTransaction().begin();
			   
			   em.persist(s1);
			   
			   em.getTransaction().commit();
			   
			   System.out.println("Empoyee " + (i+1) + "Registered successfully");
			   
			   em.close();
		
			}
	}

}
