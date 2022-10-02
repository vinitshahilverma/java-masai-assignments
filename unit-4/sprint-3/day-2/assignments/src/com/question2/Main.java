package com.question2;

public class Main {

	public static void main(String[] args) {
	 
	   Animal[] ani = new Animal[3];
	   
	    ani[0] =new Dog();
	    ani[1] = new Cat();
	    ani[2] = new Tiger();		
       
       for(int i=0; i<ani.length; i++) {
    	 
    	 System.out.println("=======================");
    	 
    	 ani[i].eat();
    	 ani[i].walk();
    	 ani[i].makeNoise();
    	   
       }
	}

}
