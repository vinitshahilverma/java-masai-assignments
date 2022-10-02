package com.question2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("Mumbai","Delhi","Kolkata","Chennai","Pune","Bokaro");

		Collections.sort(str, (c1,c2) -> c2.compareTo(c1));

		System.out.println(str);
	    
	}

}
