package com.question3;

public class Main {

	public static boolean Prime(int num) {

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static int[] findAndReturnPrimeNumber(int[] input) {

		int[] arr2 = new int[input.length];

		int index = 0;

		for (int i = 0; i < input.length; i++) {

			if (Prime(input[i])) {
				arr2[index++] = input[i];
			}
		}

		return arr2;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 12, 5, 50, 11, 14, 15 };

		int[] arr1 = findAndReturnPrimeNumber(arr);

		if (arr1[0] == 0) {
			System.out.println("Prime number not found in the supplied Array");
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == 0) {
					break;
				}
				System.out.println(arr1[i]);
			}
		}
	}

}
