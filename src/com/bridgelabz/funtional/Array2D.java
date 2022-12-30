package com.bridgelabz.funtional;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rows do you want in the array : ");
		int m = sc.nextInt();
		System.out.println("How many column do you want in the array : ");
		int n = sc.nextInt();
		
		int arr[][] = new int [m][n];
		
		System.out.println("Enter the datas of the array : ");
		for (int i=0; i<m; i++) {
			for (int j =0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
//showing the array in matrix format		
		System.out.println("The array is (in matrix format) : ");
		for (int i=0; i<m; i++) {
			for (int j =0; j<n; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

//showing the values of each array index with the index details
		System.out.println("The array is : ");
		for (int i=0; i<m; i++) {
			for (int j =0; j<n; j++) {
				System.out.println("arr["+ i +"][" + j + "] = " +arr[i][j]);
			}
		}
		
	sc.close();
	
	}

}
