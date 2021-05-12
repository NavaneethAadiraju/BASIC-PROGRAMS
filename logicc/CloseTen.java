package com.logics;

public class CloseTen {
	private static int closeTen(int num1, int num2) {
		int diff1, diff2, temp = 0;
		diff1 = Math.abs(num1 - 10);
		diff2 = Math.abs(num2 - 10);
		if (diff1 == diff2)
			temp = 0;
		if (diff1 == 2 || diff1 == 1)
			temp = num1;
		if (diff2 == 2 || diff2 == 1)
			temp = num2;
		return temp;
	}

	public static void main(String[] args) {
		int num1, num2;
		System.out.println(closeTen(8, 13));
		System.out.println(closeTen(13, 8));
		System.out.println(closeTen(13, 7));
	}
}
