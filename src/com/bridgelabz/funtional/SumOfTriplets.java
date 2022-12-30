package com.bridgelabz.funtional;

import java.util.Scanner;

public class SumOfTriplets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of input : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int count = 0;
        System.out.println("Enter Values");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < arr.length ; i++) { //i=0
            for (int j = i + 1; j < arr.length ; j++) {//j=1
                for (int k = j + 1; k < arr.length; k++) {//k=2
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        count++;
                        System.out.println("a[" + i + "]+a[" + j + "]+a[" + k +"] =  0 ");
                    }
                }
            }
        }
        System.out.println("Total count of triplets with sum 0 is : " + count);
    }
}
