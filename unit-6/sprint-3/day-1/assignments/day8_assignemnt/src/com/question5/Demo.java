package com.question5;

import java.lang.ref.Cleaner;

public class Demo {

	public static void main(String[] args) {
		
		  Collage collage = new Collage(new Clerk());
		  
		    collage.doJob();
		    
		  Collage collage1 = new Collage(new Teacher());
		  
		  collage1.doJob();

	}

}
