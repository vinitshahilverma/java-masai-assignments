package com.question1;

public class PrintName implements Runnable{
	
	String name;
	
	public PrintName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		System.out.println( name + "job started by thread: "+ Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( name + "job completed by thread: "+ Thread.currentThread().getName());
	}

}
