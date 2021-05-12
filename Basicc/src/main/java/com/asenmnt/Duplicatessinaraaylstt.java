package com.asenmnt;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicatessinaraaylstt {
	public static void main(String[] args)
    {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
        System.out.println("ArrayList with duplicates: " + l);
        List<Integer> nl = l.stream().distinct().collect(Collectors.toList());
        System.out.println("ArrayList without duplicates  "+ nl);
    }
}
