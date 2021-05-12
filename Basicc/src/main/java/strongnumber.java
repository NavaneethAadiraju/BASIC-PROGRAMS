import java.util.Scanner;

public class strongnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int input = sc.nextInt();
		int fac, sum = 0;
		int n = input;
		while (n != 0) {
			fac = 1;
			int r = n % 10;
			for (int i = r; i >= 1; i--)
				fac = fac * i;
			sum = sum + fac;
			n = n / 10;
		}
		if (sum == input)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
	}
}