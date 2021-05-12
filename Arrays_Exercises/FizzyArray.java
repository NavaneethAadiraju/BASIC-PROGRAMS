package com.arrays;

public class FizzyArray {

	private static int[] fizzyArray(int start, int end) {
		int[] newArray = new int[end - start];
		for (int i = 0; i < newArray.length; i++) {

			newArray[i] = start++;
		}
		return newArray;
	}

	public static void main(String[] args) {
		int start = 11;
		int end = 18;
		int[] newArray = fizzyArray(start, end);
		System.out.print("Elements are [");
		for (int i = 0; i < newArray.length; i++) {
			if (i < newArray.length - 1)
				System.out.print(newArray[i] + ",");
			else
				System.out.print(newArray[i]);
		}
		System.out.println("]");

	}

}
