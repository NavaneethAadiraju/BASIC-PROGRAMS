import java.util.HashMap;

public class Countchar {
	private static void convertt(String str) {
		HashMap<Character, Integer> str2 = new HashMap<Character, Integer>();
		char[] strArray = str.toCharArray();
		for (char c : strArray) {
			if (str2.containsKey(c)) {
				str2.put(c, str2.get(c) + 1);
			} else {

				str2.put(c, 1);
			}
		}
		System.out.println(str2);
	}

	public static void main(String[] args) {
		convertt("Hai hello how are you");
	}
}