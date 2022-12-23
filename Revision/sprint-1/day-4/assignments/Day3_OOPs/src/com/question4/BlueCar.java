package com.question4;

public class BlueCar extends Car{
	
	{
		System.out.print("4");
	}

	public BlueCar() {
		super("blue");
		System.out.print("5");
	}
	
	public static void main(String[] args) {
		new BlueCar();
	}

}
