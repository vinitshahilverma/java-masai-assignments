package com.question2;

public class myThread extends Thread{
	
	  int product = 1;
	
	@Override
	public void run() {
		
		synchronized (this) {
			
			
			for(int i=1; i<=10; i++) {
				product = product *i;
			}
			
			this.notify();
			
		}
		
	}

}
