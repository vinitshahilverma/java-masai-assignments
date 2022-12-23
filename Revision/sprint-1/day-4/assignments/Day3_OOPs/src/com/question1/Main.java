package com.question1;

public interface Main {
	
	default void trying() {
		System.out.println("Inside the default method");
	}
	
    static void fun1() {
    	System.out.println("Inside the static method");
    }

}
