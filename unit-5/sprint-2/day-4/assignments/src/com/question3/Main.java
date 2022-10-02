package com.question3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,10,15,16,20,25);
		
		System.out.println("============original list=====================");
		
		System.out.println(list);
		
		list.stream().forEach(l -> System.out.println(l));
		
	    List<Integer> l1 = list.stream().map(n-> n*n)
	                 .collect(Collectors.toList());
	    
	    System.out.println("============Mapped list=====================");
	    
	    System.out.println(l1);
		
	    l1.stream().forEach(l -> System.out.println(l));

	
		
		
	}

}
