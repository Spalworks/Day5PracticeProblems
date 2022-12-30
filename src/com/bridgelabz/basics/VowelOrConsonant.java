package com.bridgelabz.basics;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any letter of english alphabets : ");
		char ch = sc.next().charAt(0);
		sc.close();
		
		char letter = Character.toLowerCase(ch);
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
			System.out.println("The letter '" + letter + "' is vowel.");
		else
			System.out.println("The letter '" + ch + "' is consonant.");
	}

}
