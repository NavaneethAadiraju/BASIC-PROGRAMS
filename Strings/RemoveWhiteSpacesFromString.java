package com.strings;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		String str = "I Want to Travel Abroad";
		// 1st way
		String result = str.replaceAll("\\s", "");
		System.out.println(result);
		// 2nd way
		char[] strArray = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				stringBuffer.append(strArray[i]);
			}
		}
		String res = stringBuffer.toString();
		System.out.println(res);
	}

}
