package com.logics;

import java.util.Scanner;

class EqMat {
	int a[][], m, n;

	EqMat(int mm, int nn) {
		m = mm;
		n = nn;
		a = new int[m][n];
	}

	public void readarray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements for the array:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}

	public int check(EqMat P, EqMat Q) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (P.a[i][j] != Q.a[i][j])
					return 0;
			}
		}
		return 1;
	}

	public void print() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and column size for the array:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		EqMat A = new EqMat(a, b);
		EqMat B = new EqMat(a, b);
		A.readarray();
		B.readarray();
		A.print();
		System.out.println();
		B.print();
		if (A.check(A, B) == 1)
			System.out.println("Both are equal matrix");
		else
			System.out.println("Both are unequal matrix");
		sc.close();
	}

}
