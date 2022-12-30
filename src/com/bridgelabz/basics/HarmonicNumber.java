package com.bridgelabz.basics;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Harmonic value(term) do you want? Please Enter the number : ");
		int term = sc.nextInt();
		sc.close();
		
		double sum = 0;
		double i;
		
		for(i=1; i<=term; i++) {
			sum = sum + 1/i;
			System.out.println("sum = " + sum);
		}

	System.out.println("The value of the harmonic number of " + term + " position is : " + sum);
	}

}
