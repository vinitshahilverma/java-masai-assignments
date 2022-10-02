package com.question1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {
	
	public Map<Employee,String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		
		   Set<Employee> e1 = originalMap.keySet();
		   Collection<String> cl = originalMap.values();
		   
		   List<Employee> l1 = new ArrayList<>(e1);
		   List<String> l2 = new ArrayList<>(cl);
		   
		   System.out.println(originalMap);
		
		     
           
		   
		   TreeMap<Employee, String> tr= new TreeMap<>(new SortBySalary());
		   
		   for(int i=0; i<l1.size(); i++) {
			   
			   tr.put(l1.get(i), l2.get(i));
		   }
            
		
		  return tr;
	}

	public static void main(String[] args) {
		
		HashMap<Employee,String> hm = new HashMap<>();
		
		
		hm.put(new Employee(1,"N1",20000),"manager1");
		hm.put(new Employee(2,"N2",40000),"manager2");
		hm.put(new Employee(3,"N3",30000),"manager3");
		hm.put(new Employee(4,"N4",70000),"manager4");
		hm.put(new Employee(5,"N5",50000),"manager5");
		
		Demo d1 = new Demo();
		
		System.out.println(d1.sortMapUsingEmployeeSalary(hm));

	}

}
