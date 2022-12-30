package com.bridgelabz.basics;

public class PowerOf2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); 
		
		if(n < 0) {
			System.out.println("Please make sure that the input value is more than 0 (zero). ");
			//System.exit(0);
		}else if(n >31) {
			System.out.println("2^" + n +" is not possible because it exceeds the range of integer value.");
			System.exit(0);
		}else {
			System.out.println("The power of 2 till " + n + " are showing below :");
			for(int i=0; i<=n; i++) {
				int power = (int) Math.pow(2, i);
				System.out.println("2^" + i + " = " + power);
			}
		}
		
	}

}
