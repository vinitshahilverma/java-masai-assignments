package com.question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
        Test t = new Test();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        
        int[] arr = t.display(sc.nextInt());
        
        String sum = "";
        
        for(int i=0; i<arr.length; i++) {
             
        	if(arr[i]!=0) {
        		sum = sum + arr[i]+" ";
        	}
        	
        }
        
        System.out.println("Prime Numbers are :- " +sum);
	}

}
