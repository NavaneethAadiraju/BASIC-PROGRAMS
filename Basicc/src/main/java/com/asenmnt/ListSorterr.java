package com.asenmnt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorterr {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10, 1, -20, 40, 5, -23, 0);
		List<Integer> sortedList = l.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}
}