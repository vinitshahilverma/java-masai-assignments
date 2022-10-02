package com.question1;

import java.util.Scanner;

public class Mobile {
	
	public static String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public static String searchOutdatedModel(String str) {
		   
		
		for(int i=0; i<outdatedModels.length; i++) {
			if(str.equals(outdatedModels[i])) {
				return (str+"_OUTDATED");
			}
		}
		
		return (str+" is not out of date");
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you model");
		
		System.out.println(searchOutdatedModel(sc.next()));
		
	}

}
