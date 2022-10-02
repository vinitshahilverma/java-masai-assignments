package com.question3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class SortByDate implements Comparator<Members>{

	@Override
	public int compare(Members m1, Members m2) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		 LocalDate d1 = LocalDate.parse(m1.getMemberShipEndDate(), dtf);
		 LocalDate d2 = LocalDate.parse(m2.getMemberShipEndDate(), dtf);
		 
		return d1.compareTo(d2);
	}

	
	
	

}
