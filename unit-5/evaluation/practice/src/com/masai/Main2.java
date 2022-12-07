package com.masai;

import java.util.Stack;

public class Main2 {
	
	public static void main(String[] args) {
		
		int[] arr = {3,3,5,5,1};
		
		
		Stack<Integer> st = new Stack<>();
		
		
		for(int i=arr.length-1; i>=0; i--) {
			if(st.size()==0) {
				 st.push(0);
				
			}
			
				st.push(st.peek()+arr[i]);
			
		}
		
		System.out.println(st);
		
		for(int i=st.size()-1; i>=0; i--) {
			System.out.println(st.get(i));
		}
		
	}

}
