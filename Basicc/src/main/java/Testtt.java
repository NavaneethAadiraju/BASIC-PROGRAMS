import java.util.Scanner;

class Testtt {
	public static void main(String args[]) {
		for (;;) {
			int r, sum = 0, temp;
			System.out.println("enter num");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			temp = n;
			while (n > 0) {
				r = n % 10;
				sum = (sum * 10) + r;
				n = n / 10;
			}
			if (temp == sum)
				System.out.println("palindrome number ");
			else
				System.out.println("not palindrome\n");
		}
	}
}