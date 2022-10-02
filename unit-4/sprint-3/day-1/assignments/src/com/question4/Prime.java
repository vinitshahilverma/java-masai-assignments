package com.question4;

public class Prime {
	
	public static int factorial(int num) {
		int factorial = 1;
		for(int i=1; i<=num; i++) {
			factorial = factorial*i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		
        if(args.length==1) {
           System.out.println(factorial(Integer.parseInt(args[0])));
        }
        else if(args.length==2) {
        	int num = Math.abs(Integer.parseInt(args[0])-Integer.parseInt(args[1]));
        	System.out.println(factorial(num));
        }
        else {
        	System.out.println("Error");
        }
	}

}
