package com.question1;

public class Main {
	
//	Q1)  Is there any difference between creating a string with and without a new operator?  
//	        Explain with an example.

  // Answer:- Yes there is a difference between creating string with and without a new operator. Without new operator will occupy a space in
//	SCP(String constant pool) area with the String name. And with new operator firstly it will occupy a space in SCP area after that it will occupy
// space in HEAP area as well and store the String there after collecting it from SCP area. Which means it occupy two spaces in the RAM.
//	Below there you can see if I put both the string name on equals to it will return false which means its address is different and I will show the 
//    address as well.
	

	public static void main(String[] args) {
		
		String s1 = "Shahil";
		
		String s2 = new String("Shahil");
		
		System.out.println(s1==s2); // false
		
		System.out.println(System.identityHashCode(s1));//212628335
		
		System.out.println(System.identityHashCode(s2));//1579572132

	}

}
