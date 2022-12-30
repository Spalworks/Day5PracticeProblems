package com.bridgelabz.funtional;

public class WindChill {

	public static void main(String[] args) {
		
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		
		if(t > 50) {
			System.out.println("The value of t cannot be greater than 50");
			System.exit(0);
		}
		
		if(v > 120 || v < 3) {
			System.out.println("The value of v cannot be greater than 120 && less than 3.");
			System.exit(0);
		}
		
		System.out.println("t = " + t +"F   ,   v = " + v + " miles/hr");
		double windchill =( 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16)) );
		
		System.out.println("Windchill = " + windchill + "F");
	}

}
