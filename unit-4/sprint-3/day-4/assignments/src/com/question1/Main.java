package com.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of passenger");
		int numberOfPassenger = sc.nextInt();
		
		System.out.println("Enter the number of distance to travel in kms");
		int numberOfKms = sc.nextInt();
		
		OLA myOla = new OLA();
		
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		int res = myOla.calculateBill(myCar);
		
		System.out.println("The total fare amount is "+ res);
	}

}
