package com.arrays;

import java.util.Scanner;

public class MinNumber {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] inputArray = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = sc.nextInt();
		}
		System.out.println(getMin(inputArray));
		 sc.close();
	}
     
	private static int getMin(int[] inputArray) {
		if (inputArray.length != 10)
			return -1;
		else {
			int min = inputArray[0];
			for (int i = 0; i < inputArray.length; i++) {
				if (inputArray[i] < min) {
					min = inputArray[i];
				}
			}
			return min;
		}

	}

}
