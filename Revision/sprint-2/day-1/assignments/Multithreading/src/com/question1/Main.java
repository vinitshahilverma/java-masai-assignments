package com.question1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		PrintName[] name = {
				
			   new PrintName("Ram"),
			   new PrintName("Ravi"),
			   new PrintName("Shayam"),
			   new PrintName("Sunil"),
			   new PrintName("Suresh"),
			   new PrintName("Pavan"),
			   
		};
		

	ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(PrintName n:name) {
			service.submit(n);
		}
		
		service.shutdown();//to shutdown the excecutorService.
		
	}

}
