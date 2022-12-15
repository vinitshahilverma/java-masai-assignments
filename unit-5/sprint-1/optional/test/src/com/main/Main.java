package com.main;

class Masai{
    private void course(){
        System.out.println("This course is from Masai!");
    }
}
class prepleaf extends Masai{
     protected void course(){
        System.out.println("This course is from Prepleaf!");
    }
}

public class Main {

	  public static void main(String[] args){
		  prepleaf obj = new prepleaf();
	        obj.course();

	    }
}
