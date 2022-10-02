package com.question4;

public class Test implements Intr{
	
	
	public static boolean Prime(int num) {
		
		for(int i=2; i<num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	
	}

	@Override
	public int[] display(int p) {
		
		int count =0;
		int[] arr = new int[p];
		
		for(int i=2; i<=p; i++) {
			
			if(Prime(i)) {
				arr[count]=i;
				count++;
			}			
		}
		
		return arr;
	}

}
