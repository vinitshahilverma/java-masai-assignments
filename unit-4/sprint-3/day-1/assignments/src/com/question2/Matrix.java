package com.question2;

import java.util.Scanner;

public class Matrix {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of row");

		int row = sc.nextInt();

		System.out.println("Enter number of coloumns");

		int col = sc.nextInt();
		
		int[][] mat = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				System.out.println("Enter val for "+"row = "+i+" Col= "+j+ " ");
				
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<col; i++) {
			 int sum = 0;
			for(int j=0; j<row; j++) {
			 if(mat[j][i]%2==0) 
				sum = sum + mat[j][i];
			
			}
			System.out.println(sum);
		}
		
	}
	
	

}
