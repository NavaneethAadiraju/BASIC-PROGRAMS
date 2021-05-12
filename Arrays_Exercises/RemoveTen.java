package com.arrays;

public class RemoveTen {

	public static void main(String[] args) {
		int[] arr = { 1, 99, 10 };
		int[] newArrray = withoutTen(arr);
		System.out.print("Elements are [");
		for (int i = 0; i < arr.length; i++) {
			if (i < newArrray.length - 1)
				System.out.print(newArrray[i] + ",");
			else
				System.out.print(newArrray[i]);
		}
		System.out.println("]");
	}

	private static int[] withoutTen(int[] arr) {
		int pos = 0;
		int[] newArrray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 10) {
				newArrray[pos] = arr[i];
				pos++;
			}
		}
		return newArrray;
	}

}
