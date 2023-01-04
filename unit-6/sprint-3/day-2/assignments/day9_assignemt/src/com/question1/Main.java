package com.question1;

import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		Stack<Character> str = new Stack<>();
		
		str.push('a');
		str.push('b');
		str.push('c');
		str.push('d');
		
	    String sum = "";
		for(int i=0; i<str.size(); i++) {
			
			sum = sum + str.get(i);
		}
		
		System.out.println(sum);
	}

}
