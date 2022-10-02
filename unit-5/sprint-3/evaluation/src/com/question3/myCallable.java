package com.question3;

import java.util.concurrent.Callable;

public class myCallable implements Callable<Integer>{
	
	int num;
	
	public myCallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
     
      int product = 1;
      
      System.out.println(Thread.currentThread().getName()+" is doing the task");
      
       for(int i=1; i<=num; i++) {
    	   product = product*i;
       }
      
      
      return product;


	}

	

}
