package com.question3;

public class Demo {

	public static void main(String[] args) {
		  
	   System.out.println("===============NIT true============");
	  Student shahil= Student.getStudent(true);
	  
	  System.out.println(shahil.getRoll());
	  System.out.println(shahil.getName());
	  System.out.println(shahil.getAddress());
	  System.out.println(shahil.getCollageName());
	  
	  
	  System.out.println("===============NIT false============");
	  
	  Student vinit= Student.getStudent(false);
	  
	  System.out.println(vinit.getRoll());
	  System.out.println(vinit.getName());
	  System.out.println(vinit.getAddress());
	  System.out.println(vinit.getCollageName());

	}

}
