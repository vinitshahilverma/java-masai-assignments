package com.question2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("==================Predicate=======================");
		
		Predicate<Student> p = s -> s.getMarks()<500;
		
          boolean res =   p.test(new Student(10,"N1",400));
          
          System.out.println(res);
          
          System.out.println("==================Consumer=======================");
          
         Consumer<Student> c = s-> {
        	  System.out.println("Roll is "+s.getRoll());
        	  System.out.println("Marks is "+s.getMarks());
        	  System.out.println("Name is "+s.getName());
         };
         
            c.accept(new Student(10,"shahil",600));
            
            System.out.println("==================Supplier=======================");
            
            
         Supplier<Student> s = () ->  new Student(20,"verma",800);
    
          System.out.println(s.get());
          
          System.out.println("==================Function=======================");
          
          Function<String,Integer> f = s4 -> Integer.parseInt(s4); 
          
          int num = f.apply("20");
          
          System.out.println(num);
	}

}
