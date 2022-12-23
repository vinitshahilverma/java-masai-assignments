package com.question4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CreateAccount {

	public static void main(String[] args) throws Exception {
		
		Account acc = new Account(123456,"Shahil",2000.00);
		
		FileOutputStream f = new FileOutputStream("D:/folder/file.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(f);
		
		out.writeObject(acc);
		
		out.flush();
		out.close();
		
		System.out.println("..done");
		
           
	}

}
