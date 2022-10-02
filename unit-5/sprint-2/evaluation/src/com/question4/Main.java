package com.question4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		  List<String> list = Arrays.asList("shahil","verma","vinit","vickyk","sandeepv","yash","bhatterg","sumit","jacky","rocky");
		  
		    System.out.println("=============Original List=================");
		  
		    list.stream().forEach(s -> System.out.println(s));
		  
		  List<String> list1 = list.stream().filter(s -> s.length()%2==0)
		               .map(u -> u.toUpperCase())
		               .collect(Collectors.toList());
		  
		  System.out.println("=============Transformed List=================");
		  
		  list1.stream().sorted((s1,s2) -> s2.compareTo(s1))
		                .forEach( s -> System.out.println(s));
		  
		  
		
          
	}

}
