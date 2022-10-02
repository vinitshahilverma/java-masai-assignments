package com.question1;

public class Main {

	public static void main(String[] args) {
		
	     ThreadA  th = new ThreadA();
	     
	     th.start();
	     
	     synchronized (th) {
	    	 
	    	 System.out.println("Main thread calls the wait method");
	    	 
	    	 try {
				th.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	 
	    	System.out.println("Main thread gets the notification"); 
	    	
	    	System.out.println(th.product);
			
		}
	     
	    
	}

}
