package com.question6;

import java.util.concurrent.Callable;

public class myCallable implements Callable<String> {

	int num;
	
	public myCallable(int num) {
		this.num = num;
	}

	@Override
	public String call() throws Exception {
		
		System.out.println(Thread.currentThread().getName() + " is running");
		
		
		if(num%2==0) {
			return  " is a Even Number";
		}
		else {
			return  " is a Odd Number";
		}
		
		
	}


}
