package com.question3;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
	  
		 TreeSet<Library> l1 = new TreeSet<>(new SortById());
		 
		 l1.add(new Library(1,"abcd","shahil"));
		 l1.add(new Library(2,"abcd","shahil"));
		 l1.add(new Library(1,"abcd","shahil"));
		 l1.add(new Library(3,"abcd","shahil"));
		 l1.add(new Library(4,"abcd","shahil"));
		 l1.add(new Library(2,"abcd","shahil"));
		 
          System.out.println(l1);
          
          TreeSet<Members> m1 = new TreeSet<>(new SortByDate());
          
          m1.add(new Members(1,"shahil",123,"10-10-2020"));
          m1.add(new Members(2,"shahil",456,"12-10-2020"));
          m1.add(new Members(3,"shahil",789,"09-10-2020"));
          m1.add(new Members(1,"shahil",123,"10-10-2020"));
          m1.add(new Members(4,"shahil",126,"11-10-2020"));
          
          System.out.println(m1);
        
	}

}
