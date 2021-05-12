package com.logics;

public class In3050 {

	private static boolean in3050(int num1, int num2) {

		if (num1 >= 30 || num1 <= 40) {
			return true;
		}
		if (num2 >= 30 || num2 <= 40) {
			return true;
		}
		if (num1 >= 40 || num1 <= 50) {
			return false;
		}
		if (num2 >= 40 || num2 <= 50) {
			return false;
		} else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(in3050(30, 31));
		System.out.println(in3050(40, 50));
		System.out.println(in3050(30, 41));
		System.out.println(in3050(50, 39));
		System.out.println(in3050(40, -50));
	}

}
