package com.question3;

public class Student {
     
	  private int roll;
	  private String name;
	  private String address;
	  private String collageName;
	  
	  public Student() {
		  
	  }
	  
	  public Student(int roll, String name,String address) {
		   this.roll = roll;
		   this.name = name;
		   this.address = address;
		 	  
	}
	  
	  public Student(int roll, String name,String address,String collageName) {
		   this.roll = roll;
		   this.name = name;
		   this.address = address;
		   this.collageName = collageName; 
	}
	  
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	  
	public static Student getStudent(boolean isFromNIT) {
		   
		  Student student = new Student(); 
		  if(isFromNIT==true) {
              
			   student = new Student(1,"shahil","bokaro");
			  
			   student.setCollageName("NIT");
			   

		   }
		  else {
			  student = new Student(2,"vinit","dhanbad","Kiti");
		  }
		  return student;
	  }
}