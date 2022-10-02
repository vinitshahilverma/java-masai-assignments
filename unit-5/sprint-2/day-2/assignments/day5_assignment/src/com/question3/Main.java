package com.question3;

public class Main {

	public static void main(String[] args) {
		
      try {
		 X x = Integer::parseInt;
		 System.out.println(x.convertStringToNumber("10"));
      }
      catch(NumberFormatException ne) {
    	  
    	   System.out.println("Please Input Number");
      }
	}

}
