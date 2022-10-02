package com.question3;

public class Student implements Comparable<Student>{
    
	private int rollNo;
	private String name;
	private int mathsMarks;
	private int scienceMarks;
	private int engMarks;
	
	
	public Student(int roll, String name,int math, int sci, int eng) {
		
		this.rollNo = roll;
		this.name = name;
		this.mathsMarks = math;
		this.scienceMarks = sci;
		this.engMarks = eng;
		
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMathsMarks() {
		return mathsMarks;
	}


	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}


	public int getScienceMarks() {
		return scienceMarks;
	}


	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}


	public int getEngMarks() {
		return engMarks;
	}


	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mathsMarks=" + mathsMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + "]";
	}


	@Override
	public int compareTo(Student s1) {
		   
		if((this.getEngMarks()+this.getMathsMarks()+this.getScienceMarks())>(s1.getEngMarks()+s1.getMathsMarks()+this.getScienceMarks())) {
			return 1;
		}
		else if ((this.getEngMarks()+this.getMathsMarks()+this.getScienceMarks())<(s1.getEngMarks()+s1.getMathsMarks()+this.getScienceMarks())) {
			return -1;
		}
		else {
			
			  int res = s1.getName().compareTo(this.getName());
			  
			  if(res==0) {
				  
				  if(this.getRollNo()>s1.getRollNo()) {
					  return 1;
				  }
				  
				  else if(this.getRollNo()<s1.getRollNo()) {
					  return -1;
				  }
				  else {
					  return 0;
				  }
				  
			  }
			  
			  else {
				  return res;
			  }
			
		}
		
	}
	
	
	
	
} 
