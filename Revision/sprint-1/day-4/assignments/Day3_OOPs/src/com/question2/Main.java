package com.question2;

public class Main implements Intreface1,Interface2{

	@Override
	public int sum(int a, int b) {
		
		return Interface2.super.sum(a, b);
		
	}


}

// If we will implements both the interface having same methods and with same signature
// we have to call the super method with Interface name example Interface(name).super.method(name);
