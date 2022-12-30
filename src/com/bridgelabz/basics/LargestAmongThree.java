package com.bridgelabz.basics;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter the 2nd number : ");
		int num2 = sc.nextInt();

		System.out.println("Enter the 3rd number : ");
		int num3 = sc.nextInt();
		sc.close();

		if((num1 == num2 ) && (num2 == num3)) {
			System.out.println("Three numbers are same.");
		} 
		else if ((num1 >= num2) && (num1 >= num3)) {
			if(num1 == num2) {
				System.out.println("Largest number is " + num1 + ". Both 1st & 2nd number has the same value(" + num1 +").");
			}
			else if(num1 == num3) {
				System.out.println("Largest number is " + num1 + ". Both 1st & 3rd number has the same value(" + num1 +").");
			}else
				System.out.println("1st number is the largest among all three. The value of 1st number is " + num1 + ".");
		}
		else if ((num2 >= num1) && (num2 >= num3)) {
			if(num2 == num1) {
				System.out.println("Largest number is " + num2 + ". Both 1st & 2nd number has the same value(" + num2 +").");
			}
			else if(num2 == num3) {
				System.out.println("Largest number is " + num2 + ". Both 2nd & 3rd number has the same value(" + num2 +").");
			}else
				System.out.println("2nd number is the largest among all three. The value of 2nd number is " + num2 + ".");
		} 
		else if((num3 >= num1) && (num3 >= num2)) {
			if(num3 == num1) {
				System.out.println("Largest number is " + num3 + ". Both 1st & 3rd number has the same value(" + num3 +").");
			}
			else if(num2 == num3) {
				System.out.println("Largest number is " + num3 + ". Both 2nd & 3rd number has the same value(" + num3 +").");
			}else
				System.out.println("2nd number is the largest among all three. The value of 2nd number is " + num2 + ".");
		}


	}
}
