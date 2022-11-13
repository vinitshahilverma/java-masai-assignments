package test;

import java.util.Arrays;
import java.util.Scanner;

public class TestThread {

	public static String sum(String str) {

		String sum = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				sum = sum + str.charAt(i);
			}
		}
		return sum;
	}

	public static Integer sum(Integer[] ints) {

		Integer sum = 0;

		for (int i = 0; i < ints.length; i++) {
			sum = sum + ints[i];
		}
		return sum;
	}

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    
	    int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	    
	    Integer[] ints = Arrays.stream(array).boxed().toArray(Integer[]::new);
	    
	    
	    
	    String str = sc.nextLine();

		System.out.println(sum(ints));
		System.out.println(sum(str));
	}

}
