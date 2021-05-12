import java.util.Scanner;

public class vowelfindd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an String : ");
		String str = sc.next();
		System.out.println(str);
		System.out.println(isvowel(str));
	}

	private static char[] isvowel(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				System.out.println("Given string contains " + str.charAt(i) + " at the index " + i);
			}
		}
		return null;
	}

}
