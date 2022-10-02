package com.question4;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
	  Map<String,List<String>> hm = new TreeMap<>(new SortbyStateName());
	  
	  hm.put("Maharashtra", Arrays.asList("Mumbai","Pune","Thane","Nagpur"));
	  hm.put("Jharkhand", Arrays.asList("Ranchi","Bokaro","Dhanbad","Deoghar"));
	  hm.put("Bihar", Arrays.asList("Patna","Ara","Buxar","Gaya"));
	  hm.put("West Bengal", Arrays.asList("Kolkata","Asansol","Durgapur","Raniganj"));
	  
	  
	  Set<Map.Entry<String,List<String>>> st = hm.entrySet();
	  
	  for(Map.Entry<String, List<String>> list:st) {
		  
		  System.out.println(list.getKey()+"=============="+list.getValue());
		  
	  }
	  
	}

}
