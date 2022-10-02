package com.question4;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static LinkedHashMap<String,Student> sort(HashMap<String,Student> hm){
		
		LinkedHashMap<String,Student> lhm = new LinkedHashMap<>();
		
	      Collection<Student> cl = hm.values();
	      
	      System.out.println(hm);
	      
	      TreeSet<Student> tr = new TreeSet<>(new SortByMarks());
	      
	      for(Student st:cl) {
	    	  tr.add(st);
	      }
		 
	      Set<Map.Entry<String,Student>> set = hm.entrySet();
	      
	      for(Student st:tr) {
	      
	     for(Map.Entry<String,Student> mp:set) {

	    		 if(st.equals(mp.getValue())) {
	    			lhm.put(mp.getKey(),mp.getValue());
	    		 }
	    	 }
	    	
	     }

		
		return lhm;
	}

	public static void main(String[] args) {
	    
		HashMap<String,Student> hm = new HashMap<>();
		
		hm.put("Maharashtra", new Student(10,"N1",800));
		hm.put("Delhi", new Student(20,"N2",300));
		hm.put("Punjab", new Student(30,"N3",500));
		hm.put("Jharkhand", new Student(40,"N4",600));
		hm.put("Bihar", new Student(50,"N5",400));
		
		
		LinkedHashMap<String,Student> lhm = sort(hm);
		
		System.out.println(lhm);
	}

}
