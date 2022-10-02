package com.question2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Map<Student,String> hm = new HashMap<>();
		
		hm.put(new Student(10,"Shahil",800),"Jharkhand");
		hm.put(new Student(15,"Verma",600),"Bihar");
		hm.put(new Student(20,"Jacky",650),"Punjab");
		hm.put(new Student(21,"Vinit",400),"Maharastra");
		hm.put(new Student(10,"Sandy",700),"Delhi");
		
		System.out.println(hm);
		
		
		Collection<String> st = hm.values();
		Set<Student> it = hm.keySet();
		
		List<String> str = new ArrayList<>(st);
		List<Student> arr = new ArrayList<>(it);
		
		TreeMap<Student,String> tm = new TreeMap<>(new SortByMarks());
		
		for(int i=0; i<str.size(); i++) {
			tm.put(arr.get(i),str.get(i));
		}
		
		System.out.println(tm);
	}

}
