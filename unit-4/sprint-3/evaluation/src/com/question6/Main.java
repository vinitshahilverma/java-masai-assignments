package com.question6;

import java.util.Scanner;

public class Main {
	
	public static double getStudent(int choice) {
		
		double per = 0;
		
		if(choice == 1) {
			ArtStudent s1 = new ArtStudent();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the marks of Hindi");
			s1.setHindiMarks(sc.nextInt());
			
			System.out.println("Enter the marks of English");
			s1.setEnglishMarks(sc.nextInt());
			
			System.out.println("Enter the marks of history");
			s1.setHistoryMarks(sc.nextInt());
			
			per=s1.findPercentage();
		}
		
		else if(choice == 2) {
			ScienceStudent s1 = new ScienceStudent();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the marks of Biology");
			s1.setBiologyMarks(sc.nextInt());
			
			System.out.println("Enter the marks of Chemistry");
			s1.setChemistryMarks(sc.nextInt());
			
			System.out.println("Enter the marks of Maths");
			s1.setMathsMarks(sc.nextInt());
			
			System.out.println("Enter the marks of Physics");
			s1.setPhysicsMarks(sc.nextInt());
			
			per=s1.findPercentage();
		}
		
		else if(choice == 3) {
			CommerceStudent s1 = new CommerceStudent();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the marks of Account");
			s1.setAccountMarks(sc.nextInt());
			
			System.out.println("Enter the marks of Economics");
			s1.setEconomicsMarks(sc.nextInt());
			
			System.out.println("Enter the marks of Business Studies");
			s1.setBusinessStudiesMarks(sc.nextInt());
			
			per=s1.findPercentage();
		}
		
		return per;
	}


	public static void main(String[] args) {

       System.out.println("Enter Choice");
        
       Scanner sc = new Scanner(System.in);
       
       double per =  Main.getStudent(sc.nextInt());
       System.out.println(per);
	}

}
