package com.logics;

import java.util.Iterator;
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[][] arr1 = new int[size][size];
		System.out.println("Enter the Elements of the array1");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the Elements of the array2");
		int[][] arr2 = new int[size][size];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}

		// Addition
		int[][] resarray = new int[size][size];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				resarray[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		// printing
		for (int i = 0; i < resarray.length; i++) {
			for (int j = 0; j < resarray[i].length; j++) {
				System.out.print(resarray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
