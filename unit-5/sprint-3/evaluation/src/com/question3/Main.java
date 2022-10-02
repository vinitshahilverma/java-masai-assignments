package com.question3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		myCallable [] list = {
				
			  new myCallable(5),
			  new myCallable(2),
			  new myCallable(4),
			  new myCallable(4),
			  new myCallable(8),
			  new myCallable(3),
			  
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		
		for(myCallable s:list) {
			Future<Integer> f = service.submit(s);
			System.out.println("product of the number = "+f.get());
		}
		
		service.shutdown();

	}

}
