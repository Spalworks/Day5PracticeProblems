package com.bridgelabz.basics;

import java.util.Scanner;

public class QuotientNRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		System.out.println("Enter the divider for the number : ");
		int divider = sc.nextInt();
		sc.close();
		
		int quotient = number / divider;
		int reminder = number % divider;
		
		System.out.println("The quotient = " + quotient);
		System.out.println("The reminder is = " + reminder);
	}

}
