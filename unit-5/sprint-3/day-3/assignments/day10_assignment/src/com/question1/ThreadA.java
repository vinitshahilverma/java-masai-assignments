package com.question1;

public class ThreadA extends Thread{
	
	int product = 1;

	 @Override
	 public void run() {
		 
		 synchronized (this) {
			
			 System.out.println("Child thread performing calculation");
			 
			 for(int i=1; i<=10; i++) {
				 product = product * i;
			 }
			 
			 System.out.println("Child thread giving the notification");
			 this.notify();
			 
		}
		 
		 
	 }
}
