package com.question7;

public class Main {

	public static void main(String[] args) {
		
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		
		Thread t3 = new Thread(t1);
		Thread t4 = new Thread(t1);
		
		t3.setName("Dhoni Thread");
		t4.setName("Kohli Thread");
		
		t3.setPriority(8);
		t4.setPriority(10);
		
		t3.start();
		t4.start();
		
        
	}

}
