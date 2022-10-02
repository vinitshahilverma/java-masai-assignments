package com.question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;



public class Mobile {
	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	
	public String addMobile(String company,String model) {
		
		Set<String> e1 = mobiles.keySet();
		List<String> l2 = new ArrayList<>(e1);
		
		ArrayList<String> l1 = new ArrayList<>();
		
		for(String l4:l2) {
			if(company.equals(l4)) {
				l1.add(model);
			}
		}
		
		l1.add(model);
		
		mobiles.put(company,l1);
		
		
		return "Mobile added Successfully";
	
	}
	
	public List<String> getModels(String company){
		
		Set<String> e1 = mobiles.keySet();
		 Collection<ArrayList<String>> cl = mobiles.values();
		 
		List<String> l1 = new ArrayList<>(e1);
		List<ArrayList<String>> l2 = new ArrayList<>(cl);
		
		for(int i=0; i<l1.size(); i++) {
			if(l1.get(i).equals(company)) {
				return l2.get(i);
			}
		}
		 List<String> l3 = new ArrayList<>(e1);
		
		return l3;
	}
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		
		System.out.println(m1.addMobile("iphone", "13"));
		System.out.println(m1.addMobile("iphone", "14"));
		
		System.out.println(m1.getModels("iphone"));
		
	}

}
