package com.question4;

public class ThreadA extends Thread{
	
	ThreadC c;
	
	public ThreadA(ThreadC c) {
		this.c = c;
	}
	
	
    
	@Override
	public void run() {
		
		
		try {
			c.join();
			
			System.out.println(Thread.currentThread().getName() + " is running");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
	}
	
}
