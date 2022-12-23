package com.question1;

public class ThreadImpl1 extends Thread{

	
	@Override
	public void run() {
		
		synchronized (this) {
			int sum =0;
			for(int i=1; i<=10; i++) {
				System.out.println(Thread.currentThread().getName()+ "form Thread1");
				sum = sum + i;
			}
			System.out.println(sum+" from ThreadImpl1");
//			this.notify();
		}
	}
		

}
