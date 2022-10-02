package com.assignment_day3;

public class assignment2 {
	
	
	
	 public static void primeNumber(int n) {
		  
			if(n>=2 && n<=100){ 
			for(int i=1; i<=n; i++) {
				if(n%i==0) {
					System.out.println(i);
				}
			}
		  }
			else {
				System.out.println("Invalid Number");
			}
		  }
	 
	 public static void main(String[] args) {
		   
		    primeNumber(99);
	  }

}
