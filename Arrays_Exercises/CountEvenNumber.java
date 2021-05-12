package com.arrays;

public class CountEvenNumber {

	public static int countEvens(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 0 };
		System.out.println(countEvens(arr));

	}

}
