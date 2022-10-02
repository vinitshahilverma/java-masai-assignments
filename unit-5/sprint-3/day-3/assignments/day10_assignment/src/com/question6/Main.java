package com.question6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception{
		
		myCallable[] jobs = {
				
				new myCallable(1),
				new myCallable(2),
				new myCallable(3),
				new myCallable(4),
				new myCallable(5),
				new myCallable(6),
				
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		
		for(myCallable job:jobs) {
			Future<String> f = service.submit(job);
			System.out.println(f.get());
		}
		
		service.shutdown();

	}

}
