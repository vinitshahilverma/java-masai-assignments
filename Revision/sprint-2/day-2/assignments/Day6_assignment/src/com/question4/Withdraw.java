package com.question4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Withdraw {
	
	public static void main(String[] args) throws Exception {
		
        BufferedReader bff = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Account no");
        
        int accNo = Integer.parseInt(bff.readLine());
        
        //DeSerialization....
        
		String str = "D:/folder/file.txt";
		
		FileInputStream f = new FileInputStream(str);
		
		ObjectInputStream oin = new ObjectInputStream(f);
		
	         Account  acc = (Account)oin.readObject();
	         
	         oin.close();
	         
	         if(acc.getAccountNo()==accNo) {
	        	 
	        	 System.out.println("Enter amount");
	        	 
	        	  double amo = Double.parseDouble(bff.readLine());
	        	  
	        	  if(amo<=acc.getBalance()) {
	        		  
	        	  // Again Serialization ...
	        		  
	        		acc.setBalance(acc.getBalance()-amo);
		        	  
	  	        	FileOutputStream f2 = new FileOutputStream(str);
	  	  	 		
	  	  	 		ObjectOutputStream out = new ObjectOutputStream(f2);
	  	  	 		
	  	  	 		out.writeObject(acc);
	  	  	 		
	  	  	 		out.flush();
	  	  	 		out.close();
	  	  	 		
	  	  	 		System.out.println("....Done");
	        		  
	        	  }
	        	  else {
	        		  throw new LowBalanceException("Balance is low..");
	        	  }
	   
	         }
	         else {
	        	 throw new AccountException("Account not found");
	         }
	               
	             
	     
	}
	

}
