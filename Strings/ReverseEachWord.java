package com.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "welcome to ojas";
		// Splitting the string based on space and reverse each part and the
		// join
		String result = Arrays.asList(str.split(" ")).stream().map(s -> new StringBuilder(s).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(result);
	}

}
