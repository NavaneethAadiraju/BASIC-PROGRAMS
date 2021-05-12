package com.arrays;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] inputArray = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = sc.nextInt();
		}
		
		System.out.println("Array Sum is :"+getSum(inputArray));
		sc.close();
	}
	private static int getSum(int[] inputArray) {
		
		if(inputArray == null)
			return -1;
		else
		{
			int sum = 0;
			for (int i = 0; i < inputArray.length; i++) {
				sum += inputArray[i];
			}
			return sum;
		}
		
	}

}


	