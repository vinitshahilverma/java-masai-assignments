package com.masai;

import javax.persistence.EntityManager;

import com.utility.EMUtil;

public class Main {
	
	public static void print(Employee emp) {
		
		System.out.println("Employee id " +emp.getCid());
		System.out.println("Employee name " + emp.getName());
		System.out.println("Employee email " +emp.getEmail());
		System.out.println("Employee mobile number " +emp.getMobile());
	    emp.getAddresses().forEach( add -> {
	    	
	    	System.out.println("address " + add.getType());
	    	System.out.println("State " +add.getState());
	    	System.out.println("City " +add.getCity());
	    	System.out.println("Pin Code "+add.getPincode());
	    	
	    	 
	    });
	    
	    System.out.println("==============================================");
		
	}

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManger();
		
		Employee emp = new Employee();
		
		emp.setName("Shahil");
		emp.setEmail("shahil@gmail.com");
		emp.setMobile("7858869609");
		emp.getAddresses().add(new Address("Jharkhand","Bokaro","828404","Home"));
		emp.getAddresses().add(new Address("Maharashtra","Mumbai","425051","Office"));
		emp.getAddresses().add(new Address("Bihar","Buxar","821000","Village"));
		
		
		Employee emp1 = new Employee();
		
		emp1.setName("Vinit");
		emp1.setEmail("vinit@gmail.com");
		emp1.setMobile("7816494641");
		emp1.getAddresses().add(new Address("Jharkhand","Dhanbad","828404","Home"));
		emp1.getAddresses().add(new Address("Maharashtra","Pune","425051","Office"));
		emp1.getAddresses().add(new Address("Bihar","Ara","821000","Village"));
		
		em.getTransaction().begin();
		
		em.persist(emp);
		em.persist(emp1);
		
		em.getTransaction().commit();
		
		System.out.println("done...");
		
		em.close();
		
		print(emp);
		print(emp1);

	}

}
