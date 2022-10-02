package com.question4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
	    System.out.println("Enter start Date in dd-MM-YYYY formate");
	    String startDate = sc.next();
	    
	    System.out.println("Enter end Date in dd-MM-YYYY formate");
	    String endDate = sc.next();
	    
	    try {
	    
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate start = LocalDate.parse(startDate, dtf);
		
		LocalDate end = LocalDate.parse(endDate, dtf);
		
		
        long difference = ChronoUnit.DAYS.between(start, end);
        
        if(difference<0) {
        	System.out.println("Start date should be smaller than End date");
        }
        else {
        	 System.out.println("Total wages:- "+difference*1200);
        }
       
	    }
	    
	    catch (Exception e) {
			System.out.println("Please enter date in dd-MM-yyyy format");
		}
	}

}
