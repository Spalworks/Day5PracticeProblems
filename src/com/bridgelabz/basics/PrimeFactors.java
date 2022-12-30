package com.bridgelabz.basics;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check it's prime factors : ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.println("Prime factors of the number is : ");
		for(int i=2; i<=num; i++) {
			while (num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}

	}
}
