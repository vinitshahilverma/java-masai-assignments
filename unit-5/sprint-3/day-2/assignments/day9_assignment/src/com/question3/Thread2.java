package com.question3;

public class Thread2 extends Thread{
	
	Thread t1;
	
	public Thread2(Thread t1) {
		this.t1 = t1;
	}
	
	

	@Override
	public void run() {
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		 for(int i=1; i<=20; i++) {
			 if(i%2!=0) {
				 System.out.println("Odd number is "+ i);
			 }
		 }
		
	}
	
	

}
