package com.question3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String> lhm = new LinkedHashMap<>();
		
		lhm.put("Maharashtra","Mumbai");
		lhm.put("West Bengal","Kolkata");
		lhm.put("Jharkhand","Ranchi");
		lhm.put("Bihar","Patna");
		lhm.put("Gujarat","Gandhi Nagar");
		
		Set<Map.Entry<String, String>> set = lhm.entrySet();
		System.out.println("State=======Capital");
		
		for(Map.Entry<String,String> me:set) {
			System.out.println(me.getKey()+"======"+me.getValue());
		}

	}

}
