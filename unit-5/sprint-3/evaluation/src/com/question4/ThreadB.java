package com.question4;

public class ThreadB extends Thread{
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " is running");
		
		int sum = 0;
		
		for(int i=1; i<=20; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
