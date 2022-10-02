package com.question2;

public class CheckVowel {
	
void alphabet(char alpha){
		
		
		 String str = "abcdefghijklmnopqrstuvwxyz";
		 String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	     boolean flag = false ;
		 for(int i=0; i<str.length(); i++) {
			    char chart = str.charAt(i);
			    char chart1 = str1.charAt(i);
		        if(chart==alpha || chart1==alpha) {
		             flag = true;
		        }
			 }
		  if(flag==true) {
			  if(alpha=='a'|| alpha=='e' || alpha=='i'|| alpha=='o'|| alpha=='u'
						|| alpha=='A'|| alpha=='E'|| alpha=='I'|| alpha=='O'|| alpha=='U') {
								
					System.out.println(alpha+" is vowel");
				}
			  else {
				  System.out.println(alpha+" is consonant");
			  }
		  }
		  else {
			  System.out.println(alpha+" is error");
		  }

	}

	public static void main(String[] args) {
		 
		CheckVowel ch = new CheckVowel();
		    
             ch.alphabet('Z');
	}

}
