package com.logics;

public class RussianMultiplication {

	public static void multiplication(int num1, int num2) {
		int product = 0;
		while (num1 != 0) {
			if (num1 % 2 != 0)
				product = product + num2;
			num1 = num1 / 2;
			num2 = num2 * 2;

		}
		System.out.println("The product is: " + product);
	}

	public static void main(String[] args) {
		int num1 = 11, num2 = 12;
		multiplication(num1, num2);

	}

}
