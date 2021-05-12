import java.util.*;

public class Main {
	static String reverse(String s) {
		String res = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (i == (s.length() - 1)) {
				res += s.substring(i, i + 1).toUpperCase();
			} else {
				res += s.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.print("string before reversing :\t " + str);
		String[] arr = str.split(" ");
		System.out.println(str);
		for (String s : arr) {
			System.out.print(reverse(s));
		}

	}

}