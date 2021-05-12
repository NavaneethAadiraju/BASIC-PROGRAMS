package com.logics;

import java.util.Iterator;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] a1 = new int[5][5];
		int[][] a2 = new int[5][5];
		int[][] a3 = new int[5][5];
		int row1, row2, col1, col2;
		System.out.println("enter the matrix1 row and column");
		row1 = sc.nextInt();
		col1 = sc.nextInt();
		System.out.println("enter the matrix2 row and column");
		row2 = sc.nextInt();
		col2 = sc.nextInt();

		if (col1 != row2) {
			System.out.println("Multiplication not possible");
		} else {
			// Input
			System.out.println("Enter te elememts of the matrix 1");
			for (int indexr = 0; indexr < row1; indexr++) {
				for (int indexc = 0; indexc < col1; indexc++) {
					a1[indexr][indexc] = sc.nextInt();
				}
			}

			System.out.println("Enter te elememts of the matrix 2");
			for (int indexr = 0; indexr < row2; indexr++) {
				for (int indexc = 0; indexc < col2; indexc++) {
					a2[indexr][indexc] = sc.nextInt();
				}
			}

			// Printing
			System.out.println("Printing matrix1");
			for (int indexr = 0; indexr < row1; indexr++) {
				for (int indexc = 0; indexc < col1; indexc++) {
					System.out.print(a1[indexr][indexc] + " ");
				}
				System.out.println();
			}

			System.out.println("Printing matrix2");
			for (int indexr = 0; indexr < row2; indexr++) {
				for (int indexc = 0; indexc < col2; indexc++) {
					System.out.print(a2[indexr][indexc] + " ");
				}
				System.out.println();
			}

			// Matrix Multiplication

			for (int indexr = 0; indexr < row1; indexr++) {
				for (int indexc = 0; indexc < col2; indexc++) {

					a3[indexr][indexc] = 0;

					for (int indexk = 0; indexk < row2; indexk++) {
						a3[indexr][indexc] = a3[indexr][indexc] + (a1[indexr][indexk] * a2[indexk][indexc]);
					}
				}
			}

			// Printing matrix 3
			System.out.println("Resultant matrix");
			for (int indexr = 0; indexr < row1; indexr++) {
				for (int indexc = 0; indexc < col2; indexc++) {
					System.out.print(a3[indexr][indexc] + " ");
				}
				System.out.println();
			}
		}
	}

}
