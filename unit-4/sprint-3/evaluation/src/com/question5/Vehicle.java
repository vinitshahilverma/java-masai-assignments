package com.question5;

public interface Vehicle {
   
	 void run();
	 
	 default void service() {
		 System.out.println("Car needs service");
	 }
}  
