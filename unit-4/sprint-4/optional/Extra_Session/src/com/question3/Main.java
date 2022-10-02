package com.question3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("Current date:- "+date);
		
		LocalDate week = date.plusWeeks(1);
		System.out.println("Date after a week:- "+week);
		
		LocalDate month = week.plusMonths(1);
		System.out.println("Date after one week and one month:- "+month);
		
		LocalDate year = month.plusYears(1);
		System.out.println("Date after one week, one month and one year:- "+year);
		
		LocalDate years = year.plusYears(10);
		System.out.println("Date after one week, one month, one year and 10years:- "+year);
	}

}
