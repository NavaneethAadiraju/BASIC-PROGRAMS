package com.testt;

import java.util.Scanner;

public class TES {
	public static void main(String[] args) {
		int temp;

		// User inputs the array size
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements you want in the array: ");
		int n = s.nextInt();

		int num[] = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("Array Elements in Ascending Order: ");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(num[i] + ", ");
		}
		System.out.print(num[n - 1]);
	}
}