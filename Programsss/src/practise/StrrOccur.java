package practise;

import java.util.*;

public class StrrOccur {
	static void characterCount(String inputString) {

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {

				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {

				charCountMap.put(c, 1);
			}
		}
		System.out.println(inputString + " : " + charCountMap);
		Set<Character> wordsinstr = charCountMap.keySet();
		System.out.println("Duplicate Characters In " + inputString);
		for (Character ch : wordsinstr) {
			if (charCountMap.get(ch) > 1) {

				System.out.println(ch + " : " + charCountMap.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to count: ");
		characterCount(sc.nextLine());

	}

}
