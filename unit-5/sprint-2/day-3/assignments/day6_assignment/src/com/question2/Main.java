package com.question2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	public static String supply() {
		
		return "message from supply method";
		
	}
	
	
	public static void main(String[] args) {
		
//		=======================Predicate===============================================
		
		System.out.println("================Pridecate============");
		
		
		Predicate<Student> p = s -> s.getMarks()>500;

		boolean result = p.test(new Student(15,"Shahil",800));
		
		System.out.println(result);
		
		
		List<Student> s1 = new ArrayList<Student>();
		
		s1.add(new Student(10,"N1",600));
		s1.add(new Student(12,"N2",800));
		s1.add(new Student(14,"N3",900));
		s1.add(new Student(16,"N4",500));
		s1.add(new Student(18,"N5",700));
		
	    s1.removeIf(s-> s.getMarks()>700);
	    
	    for(Student f:s1) {
	    	System.out.println(f);
	    }
	    
	    
	//===================================Supplier================================================
	    
	    System.out.println("===============supplier====================================");
	    
	     Supplier<String> sup = () -> "message from supplier" ;
	     
	     System.out.println(sup.get());
	     
	     Supplier<Student> sup1 = () -> new Student(16,"N4",500);
	     
	     System.out.println(sup1.get());
	     
	     Supplier<String> sup3 = Main::supply;
	     
	     System.out.println(sup3.get());
		
		
		//================================Consumer=================================================
	     
	     System.out.println("=============Consumer============================================");
		
		
		Consumer<Student> cons = s -> System.out.println(s);
			
		cons.accept(new Student(10,"Shahil",200));
		
	    s1.forEach(s->{
         	 System.out.println("Roll no is "+s.getRoll());
	    	 System.out.println("Name is "+s.getName());
	    	 System.out.println("Marks is "+(s.getMarks()+50));
	    	
	    });
	    
	  //================================Function=================================================
	    
	    System.out.println("======================Function=================================");
	    
	    Function<Student,Integer> fun =  s -> s.getMarks()>500 ? s.getMarks() : 0;
	    
	    int result1 = fun.apply(new Student(30,"verma", 300));
	    
	    System.out.println(result1);
	}

}
