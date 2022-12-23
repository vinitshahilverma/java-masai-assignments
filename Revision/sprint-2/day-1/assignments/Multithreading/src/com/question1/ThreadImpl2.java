package com.question1;

public class ThreadImpl2 implements Runnable{

	@Override
	public void run() {
		
		synchronized (this) {
			int sum = 0;
			for(int i=1; i<=10; i++) {
				System.out.println(Thread.currentThread().getName()+ "form Thread2");
				sum = sum + i;
			}
			System.out.println(sum+ " From ThreadImpl2");
             this.notify();
		}  
		
	}

}
