package com.question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D://shahil.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line!=null) {
			
			System.out.println(line);
			
		    line = br.readLine();
		}
		
		br.close();

	}

}
