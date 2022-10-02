 package com.question4b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	
	public static boolean check(String str) {
		
		Pattern p = Pattern.compile("mob:[6-9]",5);
		Matcher m = p.matcher(str);
		
		return m.find() && str.length()==14;
		
	}

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D://shahil.txt");
		
	    BufferedReader br = new BufferedReader(fr);
	    
	    String str = br.readLine();
	    
	    while(str!=null) {
	    	System.out.println(check(str)+" "+str); 
	    	str = br.readLine();
	    }

	}

}
