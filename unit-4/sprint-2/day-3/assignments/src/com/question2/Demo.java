package com.question2;

public class Demo {
	
	
	  Demo(){
		 System.out.println("Inside no parameter constructor");
	  }
	  
	  Demo(String s){
		  System.out.println("Inside string constructor");
	  }
	  
	  Demo(int i){
		  System.out.println("inside integer constructor");
	  }
	  
	  Demo(float f){
		  System.out.println("Inside float primitive data constructor");
	  }

	public static void main(String[] args) {
		   
	
		  new Demo(10);
		   
		
		 
	}

}
