package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Integer");

		int i = sc.nextInt();

		System.out.println("Enter double");

		double d = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Enter String");

		String s = sc.nextLine();
		
		System.out.println(s);
		System.out.println(d);
		System.out.println(i);

	}

}
