package com.logics;

public class NearHundred {

	private static boolean nearHundred(int num) {

		for (int index = 10; index < 200; index++) {
			if ((num) >= 90 && (num) <= 110) {

				return true;
			}
			if ((num) >= 190 && (num) <= 210) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println(nearHundred(93));
		System.out.println(nearHundred(90));
		System.out.println(nearHundred(89));
		System.out.println(nearHundred(121));
		System.out.println(nearHundred(191));
		System.out.println(nearHundred(210));
		System.out.println(nearHundred(-101));

	}

}
