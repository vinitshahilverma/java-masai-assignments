package com.question6;

public class ArtStudent implements Student{
      
	private int hindiMarks;
	private int englishMarks;
	private int historyMarks;
	
	
	public ArtStudent() {
		
	}
	
	public ArtStudent(int hindi, int english, int history) {
		
		this.hindiMarks = hindi;
		this.englishMarks = english;
		this.historyMarks = history;
	}

	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	@Override
	public double findPercentage() {
		
		double precentage = ((this.getHindiMarks()+this.getEnglishMarks()+
				this.getHistoryMarks())/3);
		
		return precentage;
	}
	
	
}
