package com.masai;

public abstract class Animal {

	String name;

	public Animal(String name) {
		this.name = name;
	}

	public Animal() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void makeNoise();
	
    public abstract void eat();
    
    public void sleep() {
    	if(name==null) {
    		System.out.println("Animal is sleeping");
    	}
    	else
    	System.out.println(name+" Animal is sleeping");
    }

}
