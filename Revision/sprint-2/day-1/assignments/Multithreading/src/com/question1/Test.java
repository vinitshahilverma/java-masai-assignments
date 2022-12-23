package com.question1;

public class Test {
	
	public static void main(String[] args) {
		
		 ThreadImpl1 t1 = new ThreadImpl1();
		 
		 ThreadImpl2 t2 = new ThreadImpl2();
		 
		 Thread t3 = new Thread(t2);
		 
		 t3.start();
		 
		 
		 synchronized (t3) {
			 
			 try {
				t3.wait();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			 
			 t1.start();
			
		}
		 
		
	}

}
