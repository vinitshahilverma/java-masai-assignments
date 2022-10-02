package com.day4_assignment;

public class WholeNumber {
	
	void printNumber(int x) {
		
		if(x>0 && x%2!=0) {
			System.out.println(x);
		}
		else if(x>0 && x%2==0) {
			System.out.println(Math.round((x/10)+1)*10);
		}
		else {
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		
	  WholeNumber num = new WholeNumber();
		
            num.printNumber(44);
	}
;
}
 