package com.asenmnt;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Arrattomapp {
	public static Map<Integer, String> ConvertToMap(String[] names) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		for (int i = 0; i < names.length; i++) {
			m.put(i + 1, names[i]);
		}
		return m;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		String[] str = new String[scan.nextInt()];
		for (int i = 0; i < str.length; i++) {
			System.out.println("Enter name " + (i + 1));
			str[i] = scan.next();
		}
		if (str.length == 0) {
			System.out.println("Null");
		} else {
			Map<Integer, String> m = ConvertToMap(str);
			for (Map.Entry<Integer, String> x : m.entrySet()) {
				System.out.println(x.getKey() + " " + x.getValue());

			}
		}
	}
}
