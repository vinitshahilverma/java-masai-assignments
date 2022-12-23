package com.masai;

public class Dog extends Animal{
	
	
	
	String breed;
	
	public Dog() {
		
	}
     
	public Dog(String breed) {
		this.breed=breed;
	}
	
	public Dog(String breed,String name) {
		super(name);
		this.breed=breed;
	}
	
	@Override
	public void makeNoise() {
		if(breed==null) {
			System.out.println("Dog is Barking...");
		}
		else
       System.out.println(breed+" Dog is Barking...");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void eat() {
		if(breed==null) {
			System.out.println("Dog is Eating...");
		}
		else
		System.out.println(breed +" Dog is Eating...");
	}
	
	public void play() {
		if(breed==null) {
			System.out.println("Dog is Playing...");
		}
		else
		System.out.println(breed+" Dog is playing...");
	}

}
