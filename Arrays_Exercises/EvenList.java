package com.arrays;

import java.util.Scanner;

public class EvenList {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] inputArray = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = sc.nextInt();
		}

		int[] newArray = getEvenArray(inputArray);
		if (newArray != null) {
			System.out.print("Even Number List [");
			for (int i = 0; i < newArray.length; i++) {
				if (i < newArray.length - 1)
					System.out.print(newArray[i] + ",");
				else
					System.out.print(newArray[i]);
			}
			System.out.println("]");
		} else
			System.out.println(newArray);
		sc.close();

	}

	private static int[] getEvenArray(int[] inputArray) {
		if (inputArray.length != 10)
			return null;
		else {
			int size = 0;
			for (int i = 0; i < inputArray.length; i++) {
				if (inputArray[i] % 2 == 0)
					size++;
			}

			int[] newArray = new int[size];
			int pos = 0;
			for (int i = 0; i < inputArray.length; i++) {
				if (inputArray[i] % 2 == 0) {
					newArray[pos] = inputArray[i];
					pos++;
				}
			}
			return newArray;
		}
	}

}
