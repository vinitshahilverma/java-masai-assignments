package com.question6;

public class ScienceStudent implements Student {
    
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	private int biologyMarks;
	
	public ScienceStudent() {
		
	}
	
     public ScienceStudent(int phy,int che,int math, int bio) {
		
    	 this.physicsMarks = phy;
    	 this.chemistryMarks = che;
    	 this.mathsMarks = math;
    	 this.biologyMarks = bio;
	}

	public int getPhysicsMarks() {
		return physicsMarks;
	}

	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public int getBiologyMarks() {
		return biologyMarks;
	}

	public void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}

	@Override
	public double findPercentage() {
		
		double precentage = ((this.getPhysicsMarks()+this.getMathsMarks()+
				this.getChemistryMarks()+this.getBiologyMarks())/4);
		
		return precentage;
	}
     
     
	
}
