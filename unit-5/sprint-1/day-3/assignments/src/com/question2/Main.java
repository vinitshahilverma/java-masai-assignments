package com.question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	
	public static void display(String dob) {
		
		
		try {
			
			
		LocalDate ld = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate st = LocalDate.parse(dob, dtf);
		
		long difference = ChronoUnit.YEARS.between(st, ld);
		
		
		if(difference<=0) {
			
			System.out.println("Date should not be in Future");
			
		}
		else {
			System.out.println("You are "+difference+" Years old");
		}
		
		}
		catch (Exception e) {
			
			System.out.println("Please enter the date in correct formate");
			
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your date of Birth in dd-MM-yyyy formate");
		
		String str = sc.next();
		display(str);
          
	}

}
