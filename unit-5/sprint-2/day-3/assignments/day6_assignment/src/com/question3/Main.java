package com.question3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public Map<String,Student> sortMapUsingStudentName(Map<String,Student> originalMap){
		
		LinkedHashMap<String, Student> lhm = new LinkedHashMap<>();
	
		Collection<Student> cl = originalMap.values();
				
		List<Student> list = new ArrayList<>(cl);
		
		Collections.sort(list, (s1,s2)-> s2.getName().compareTo(s1.getName()));
		
		Set<Map.Entry<String, Student>> set = originalMap.entrySet();
		
		for(Student s: list) {
			
			for(Map.Entry<String,Student> m : set) {
				if(s.equals(m.getValue())) {
					lhm.put(m.getKey(),m.getValue());
				}
			}
			
		}
		
		
		
		return lhm;
	}

	public static void main(String[] args) {
	
		
		HashMap<String,Student> hm = new HashMap<>();
		
		hm.put("India",new Student(10,"shahil","shahil@gamil.com",500));
		hm.put("UnitedKindom",new Student(12,"sam","sam@gamil.com",600));
		hm.put("America",new Student(13,"jeene","jeene@gamil.com",550));
		hm.put("Austriala",new Student(14,"tony","tony@gamil.com",620));
		hm.put("NewZeland",new Student(16,"kakar","kakar@gamil.com",700));
		
		Main m = new Main();
		
		Map<String,Student> map = m.sortMapUsingStudentName(hm);
		
		Set<Map.Entry<String, Student>> set = map.entrySet();
		
		for(Map.Entry<String, Student> ma : set) {
			
			System.out.println(ma.getKey()+"==========="+ma.getValue());
		}

	}

}
