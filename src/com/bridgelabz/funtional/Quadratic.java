package com.bridgelabz.funtional;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a :");
		int a = sc.nextInt();
		System.out.println("enter the value of b :");
		int b = sc.nextInt();
		System.out.println("enter the value of c :");
		int c = sc.nextInt();
		sc.close();
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println("Delta value = " + delta);
		double root1 = (- b + Math.sqrt(delta)) / (2 * a);
		double root2 = (- b - Math.sqrt(delta)) / (2 * a);

		System.out.println("root1 of x is : " + root1);
		System.out.println("root2 of x is : " + root2);
	}
}