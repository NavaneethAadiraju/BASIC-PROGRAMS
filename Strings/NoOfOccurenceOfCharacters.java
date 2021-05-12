package com.strings;

public class NoOfOccurenceOfCharacters {
	static final int maxChar = 256;

	static void getOccuringChar(String str) {
		// create an array of size 256
		// i.e ASCII Size
		int count[] = new int[maxChar];
		int len = str.length();
		// Initialize count array index
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;
		// create an array of given String size
		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				// If any matches found
				if (str.charAt(i) == ch[j])
					find++;
			}
			if (find == 1)
				System.out.println("Number of Occurence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
		}
	}

	// Driver Code
	public static void main(String[] args) {
		String str = "javaconceptoftheday";
		getOccuringChar(str);

	}

}
