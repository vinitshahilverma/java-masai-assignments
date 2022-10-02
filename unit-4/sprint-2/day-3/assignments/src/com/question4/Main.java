package com.question4;

public class Main {
    
	
	public static void main (String[] args) {
		
	System.out.println("===========Harrier================");	
	
	   Car c1 = new Car("Harrier","Tata","black",10000,110,"Tata");
	   
	       c1.showDetails();
	       
	  System.out.println("==================Punch===============");
	       
	   Car c2 = new Car();
	       c2.model="Punch";
	       c2.companyName = "Tata";
	       c2.color = "Blue";
	       c2.engine.rpm = 100000;
	       c2.engine.power = 100;
	       c2.engine.manufacturer = "Tata";
	       
	       c2.showDetails();
	   
	}
   
      
	 
	
}
