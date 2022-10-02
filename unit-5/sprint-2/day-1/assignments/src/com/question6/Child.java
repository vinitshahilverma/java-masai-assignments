package com.question6;

public class Child extends Parent{

	
     public Child() throws Exception{
    	 super();
     }

	public static void main(String[] args) {
   
		try {
			Child ch = new Child();
			ch.fun1();
		} catch (Exception e) {
			e.getMessage();
		}
		 

   }
}