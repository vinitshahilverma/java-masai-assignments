package com.question2;

public class Main {

	public static void main(String[] args) {

        myThread tr = new myThread();
        
        tr.start();
        
        synchronized (tr) {
        	
        	try {
				tr.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
        
        System.out.println(tr.product);

	}

}
