

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		for (int i = 1; i <= range; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i +" * " + j + " = "+ (i*j));
			}
			System.out.println();
		}

	}

}
