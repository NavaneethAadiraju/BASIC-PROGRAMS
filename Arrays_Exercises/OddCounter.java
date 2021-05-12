package com.arrays;

import java.util.Scanner;

public class OddCounter {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] inputArray = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = sc.nextInt();
		}

		System.out.println(getOddCount(inputArray));
		sc.close();
	}

	private static int getOddCount(int[] inputArray)
	{
		if(inputArray.length != 10)
			return -1;
		else
		{
			int occurence = 0;
			for (int i = 0; i < inputArray.length; i++) {
				if (inputArray[i] %2 != 0) {
					occurence++;
				}
			}
			return occurence;
		}

	}

}
