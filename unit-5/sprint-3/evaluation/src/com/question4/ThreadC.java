package com.question4;

public class ThreadC extends Thread{
	
	ThreadB thread;
	
	public ThreadC(ThreadB thread) {
		this.thread = thread;
	}
	
	
	public void run() {
		
		
		
		try {
			thread.join();
			
			System.out.println(Thread.currentThread().getName() + " is running");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int product =1;
		
		for(int i=1; i<=10; i++) {
			product = product*i;
		}
		
		System.out.println(product);
	}

}
