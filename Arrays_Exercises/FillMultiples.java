package com.arrays;

import java.util.Scanner;

public class FillMultiples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		if (number <= 0) {
			System.out.println("null");
		} else {
			FillMultiples mon = new FillMultiples();
			int[] resultArray = mon.getMultiplesArray(number);

			for (int i = 0; i < resultArray.length; i++) {
				System.out.print(resultArray[i] + " ");
			}
		}
		sc.close();
	}

	public int[] getMultiplesArray(int number) {
		int[] array = new int[10];
		int index1 = 0;
		for (int index = 1; index <= 100; index++) {
			if (number % index == 0) {
				array[index1] = index;
				index1++;
			}
		}
		return array;

	}

}
