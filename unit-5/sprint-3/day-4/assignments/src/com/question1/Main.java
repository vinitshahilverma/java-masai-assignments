package com.question1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		File f = new File("D://adc.txt");
		
	    
	    try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	    System.out.println(f.exists());
	    
	    try {
			
			
			PrintWriter pr = new PrintWriter(f);
			
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.println("Enter Employee Name");
		    String name = sc.next();
		    
		    System.out.println("Enter Employee address");
		    String add = sc.next();
		    
		    pr.println("Employee Name is "+name);
		    pr.println("Employee address is "+add);
			
			
			pr.flush();
			pr.close();
			
			System.out.println("Done...");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
