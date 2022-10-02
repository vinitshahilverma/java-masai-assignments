package com.question4;

public class Main {

	public static void main(String[] args) {
		
		ThreadB b = new ThreadB();
		ThreadC c = new ThreadC(b);
		ThreadA a = new ThreadA(c);
		
		a.setName("Kohli");
		b.setName("Dhoni");
		c.setName("Rohit");
		
		
		a.start();
		b.start();
		c.start();

	}

}
