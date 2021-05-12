package com.logics;

import java.util.Scanner;

public class SumDouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num = sc.nextInt();
		System.out.println("Enter the second number:");
		int num1 = sc.nextInt();
		System.out.println(sumDouble(num, num1));

	}

	private static int sumDouble(int num1, int num2) {

		if (num1 == num2)
			return (num1 + num2) * 2;
		else
			return num1 + num2;

	}

}
